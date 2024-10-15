// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserKubeConfigStatesRequest} extends {@link RequestModel}
 *
 * <p>ListUserKubeConfigStatesRequest</p>
 */
public class ListUserKubeConfigStatesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_number")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    private ListUserKubeConfigStatesRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserKubeConfigStatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListUserKubeConfigStatesRequest, Builder> {
        private String uid; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListUserKubeConfigStatesRequest request) {
            super(request);
            this.uid = request.uid;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The ID of the specified Resource Access Management (RAM) user or RAM role within the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>2xxxxxxxxxxxxxxxxxx</p>
         */
        public Builder uid(String uid) {
            this.putPathParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <ul>
         * <li>Valid values: ≥ 1.</li>
         * <li>Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li>Value values: 1 to 100.</li>
         * <li>Default value: 50.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListUserKubeConfigStatesRequest build() {
            return new ListUserKubeConfigStatesRequest(this);
        } 

    } 

}
