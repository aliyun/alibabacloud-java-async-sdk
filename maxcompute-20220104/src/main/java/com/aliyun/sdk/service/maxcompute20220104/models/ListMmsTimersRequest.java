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
 * {@link ListMmsTimersRequest} extends {@link RequestModel}
 *
 * <p>ListMmsTimersRequest</p>
 */
public class ListMmsTimersRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("srcDbName")
    private String srcDbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("srcTableName")
    private String srcTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("stopped")
    private Boolean stopped;

    private ListMmsTimersRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.srcDbName = builder.srcDbName;
        this.srcTableName = builder.srcTableName;
        this.stopped = builder.stopped;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsTimersRequest create() {
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
     * @return srcDbName
     */
    public String getSrcDbName() {
        return this.srcDbName;
    }

    /**
     * @return srcTableName
     */
    public String getSrcTableName() {
        return this.srcTableName;
    }

    /**
     * @return stopped
     */
    public Boolean getStopped() {
        return this.stopped;
    }

    public static final class Builder extends Request.Builder<ListMmsTimersRequest, Builder> {
        private Long sourceId; 
        private String name; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String srcDbName; 
        private String srcTableName; 
        private Boolean stopped; 

        private Builder() {
            super();
        } 

        private Builder(ListMmsTimersRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.name = request.name;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.srcDbName = request.srcDbName;
            this.srcTableName = request.srcTableName;
            this.stopped = request.stopped;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
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
         * srcDbName.
         */
        public Builder srcDbName(String srcDbName) {
            this.putQueryParameter("srcDbName", srcDbName);
            this.srcDbName = srcDbName;
            return this;
        }

        /**
         * srcTableName.
         */
        public Builder srcTableName(String srcTableName) {
            this.putQueryParameter("srcTableName", srcTableName);
            this.srcTableName = srcTableName;
            return this;
        }

        /**
         * stopped.
         */
        public Builder stopped(Boolean stopped) {
            this.putQueryParameter("stopped", stopped);
            this.stopped = stopped;
            return this;
        }

        @Override
        public ListMmsTimersRequest build() {
            return new ListMmsTimersRequest(this);
        } 

    } 

}
