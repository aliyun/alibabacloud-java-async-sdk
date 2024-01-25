// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudResourceListRequest} extends {@link RequestModel}
 *
 * <p>GetCloudResourceListRequest</p>
 */
public class GetCloudResourceListRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("CloudRegionId")
    private String cloudRegionId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("IsOptional")
    private Integer isOptional;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PrivateIp")
    private String privateIp;

    @Query
    @NameInMap("ReleaseStatus")
    private Integer releaseStatus;

    @Query
    @NameInMap("TagName")
    private String tagName;

    @Query
    @NameInMap("Uid")
    private String uid;

    private GetCloudResourceListRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.cloudRegionId = builder.cloudRegionId;
        this.currentPage = builder.currentPage;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.isOptional = builder.isOptional;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.privateIp = builder.privateIp;
        this.releaseStatus = builder.releaseStatus;
        this.tagName = builder.tagName;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudResourceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    /**
     * @return cloudRegionId
     */
    public String getCloudRegionId() {
        return this.cloudRegionId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isOptional
     */
    public Integer getIsOptional() {
        return this.isOptional;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return privateIp
     */
    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * @return releaseStatus
     */
    public Integer getReleaseStatus() {
        return this.releaseStatus;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetCloudResourceListRequest, Builder> {
        private String businessGroupId; 
        private String cloudRegionId; 
        private Integer currentPage; 
        private String id; 
        private String instanceId; 
        private String instanceName; 
        private Integer isOptional; 
        private String operaUid; 
        private Integer pageSize; 
        private String privateIp; 
        private Integer releaseStatus; 
        private String tagName; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudResourceListRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.cloudRegionId = request.cloudRegionId;
            this.currentPage = request.currentPage;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.isOptional = request.isOptional;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.privateIp = request.privateIp;
            this.releaseStatus = request.releaseStatus;
            this.tagName = request.tagName;
            this.uid = request.uid;
        } 

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * CloudRegionId.
         */
        public Builder cloudRegionId(String cloudRegionId) {
            this.putQueryParameter("CloudRegionId", cloudRegionId);
            this.cloudRegionId = cloudRegionId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IsOptional.
         */
        public Builder isOptional(Integer isOptional) {
            this.putQueryParameter("IsOptional", isOptional);
            this.isOptional = isOptional;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
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
         * PrivateIp.
         */
        public Builder privateIp(String privateIp) {
            this.putQueryParameter("PrivateIp", privateIp);
            this.privateIp = privateIp;
            return this;
        }

        /**
         * ReleaseStatus.
         */
        public Builder releaseStatus(Integer releaseStatus) {
            this.putQueryParameter("ReleaseStatus", releaseStatus);
            this.releaseStatus = releaseStatus;
            return this;
        }

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetCloudResourceListRequest build() {
            return new GetCloudResourceListRequest(this);
        } 

    } 

}
