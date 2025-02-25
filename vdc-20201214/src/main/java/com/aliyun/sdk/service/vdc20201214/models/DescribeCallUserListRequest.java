// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCallUserListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCallUserListRequest</p>
 */
public class DescribeCallUserListRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Query
    @NameInMap("CreatedTs")
    @Validation(required = true)
    private Long createdTs;

    @Query
    @NameInMap("DestroyedTs")
    private Long destroyedTs;

    @Query
    @NameInMap("ExtDataType")
    private String extDataType;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryExpInfo")
    private Boolean queryExpInfo;

    @Query
    @NameInMap("RoleType")
    private String roleType;

    @Query
    @NameInMap("UserId")
    private String userId;

    private DescribeCallUserListRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.createdTs = builder.createdTs;
        this.destroyedTs = builder.destroyedTs;
        this.extDataType = builder.extDataType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.queryExpInfo = builder.queryExpInfo;
        this.roleType = builder.roleType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCallUserListRequest create() {
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
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return createdTs
     */
    public Long getCreatedTs() {
        return this.createdTs;
    }

    /**
     * @return destroyedTs
     */
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    /**
     * @return extDataType
     */
    public String getExtDataType() {
        return this.extDataType;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryExpInfo
     */
    public Boolean getQueryExpInfo() {
        return this.queryExpInfo;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeCallUserListRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long createdTs; 
        private Long destroyedTs; 
        private String extDataType; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Boolean queryExpInfo; 
        private String roleType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCallUserListRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.createdTs = request.createdTs;
            this.destroyedTs = request.destroyedTs;
            this.extDataType = request.extDataType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.queryExpInfo = request.queryExpInfo;
            this.roleType = request.roleType;
            this.userId = request.userId;
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
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * CreatedTs.
         */
        public Builder createdTs(Long createdTs) {
            this.putQueryParameter("CreatedTs", createdTs);
            this.createdTs = createdTs;
            return this;
        }

        /**
         * DestroyedTs.
         */
        public Builder destroyedTs(Long destroyedTs) {
            this.putQueryParameter("DestroyedTs", destroyedTs);
            this.destroyedTs = destroyedTs;
            return this;
        }

        /**
         * ExtDataType.
         */
        public Builder extDataType(String extDataType) {
            this.putQueryParameter("ExtDataType", extDataType);
            this.extDataType = extDataType;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * QueryExpInfo.
         */
        public Builder queryExpInfo(Boolean queryExpInfo) {
            this.putQueryParameter("QueryExpInfo", queryExpInfo);
            this.queryExpInfo = queryExpInfo;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeCallUserListRequest build() {
            return new DescribeCallUserListRequest(this);
        } 

    } 

}
