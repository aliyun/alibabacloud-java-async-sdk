// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMPULayoutInfoListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMPULayoutInfoListRequest</p>
 */
public class DescribeMPULayoutInfoListRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("LayoutId")
    private Long layoutId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Long pageNum;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    private DescribeMPULayoutInfoListRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.layoutId = builder.layoutId;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMPULayoutInfoListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return layoutId
     */
    public Long getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeMPULayoutInfoListRequest, Builder> {
        private String appId; 
        private Long layoutId; 
        private String name; 
        private Long ownerId; 
        private Long pageNum; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMPULayoutInfoListRequest response) {
            super(response);
            this.appId = response.appId;
            this.layoutId = response.layoutId;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * LayoutId.
         */
        public Builder layoutId(Long layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeMPULayoutInfoListRequest build() {
            return new DescribeMPULayoutInfoListRequest(this);
        } 

    } 

}
