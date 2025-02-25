// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelservice20220614.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRechargeBillsRequest} extends {@link RequestModel}
 *
 * <p>ListRechargeBillsRequest</p>
 */
public class ListRechargeBillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    private String sceneType;

    private ListRechargeBillsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sceneType = builder.sceneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRechargeBillsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    public static final class Builder extends Request.Builder<ListRechargeBillsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sceneType; 

        private Builder() {
            super();
        } 

        private Builder(ListRechargeBillsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sceneType = request.sceneType;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SceneType.
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        @Override
        public ListRechargeBillsRequest build() {
            return new ListRechargeBillsRequest(this);
        } 

    } 

}
