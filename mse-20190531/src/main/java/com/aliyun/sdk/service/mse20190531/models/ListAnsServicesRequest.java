// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAnsServicesRequest} extends {@link RequestModel}
 *
 * <p>ListAnsServicesRequest</p>
 */
public class ListAnsServicesRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("HasIpCount")
    private String hasIpCount;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    private ListAnsServicesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.groupName = builder.groupName;
        this.hasIpCount = builder.hasIpCount;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestPars = builder.requestPars;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnsServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return hasIpCount
     */
    public String getHasIpCount() {
        return this.hasIpCount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
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
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ListAnsServicesRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private String groupName; 
        private String hasIpCount; 
        private String instanceId; 
        private String namespaceId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestPars; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListAnsServicesRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterId = request.clusterId;
            this.groupName = request.groupName;
            this.hasIpCount = request.hasIpCount;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.requestPars = request.requestPars;
            this.serviceName = request.serviceName;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the cluster.
         * <p>
         * 
         * > This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the contact group.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Specifies whether to query the number of instances that are used for the service.
         */
        public Builder hasIpCount(String hasIpCount) {
            this.putQueryParameter("HasIpCount", hasIpCount);
            this.hasIpCount = hasIpCount;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * > This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the namespace.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The extended request parameter in the JSON format.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ListAnsServicesRequest build() {
            return new ListAnsServicesRequest(this);
        } 

    } 

}
