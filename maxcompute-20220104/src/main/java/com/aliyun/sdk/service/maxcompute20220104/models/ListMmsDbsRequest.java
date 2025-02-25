// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListMmsDbsRequest} extends {@link RequestModel}
 *
 * <p>ListMmsDbsRequest</p>
 */
public class ListMmsDbsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sorter")
    private Sorter sorter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListMmsDbsRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sorter = builder.sorter;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsDbsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sorter
     */
    public Sorter getSorter() {
        return this.sorter;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListMmsDbsRequest, Builder> {
        private Long sourceId; 
        private String name; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Sorter sorter; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListMmsDbsRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.name = request.name;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sorter = request.sorter;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000018</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * sorter.
         */
        public Builder sorter(Sorter sorter) {
            String sorterShrink = shrink(sorter, "sorter", "json");
            this.putQueryParameter("sorter", sorterShrink);
            this.sorter = sorter;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListMmsDbsRequest build() {
            return new ListMmsDbsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsDbsRequest} extends {@link TeaModel}
     *
     * <p>ListMmsDbsRequest</p>
     */
    public static class Sorter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("numRows")
        private String numRows;

        @com.aliyun.core.annotation.NameInMap("size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Sorter(Builder builder) {
            this.numRows = builder.numRows;
            this.size = builder.size;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sorter create() {
            return builder().build();
        }

        /**
         * @return numRows
         */
        public String getNumRows() {
            return this.numRows;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String numRows; 
            private String size; 
            private String updateTime; 

            /**
             * numRows.
             */
            public Builder numRows(String numRows) {
                this.numRows = numRows;
                return this;
            }

            /**
             * size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Sorter build() {
                return new Sorter(this);
            } 

        } 

    }
}
