// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceConnectionsRequest</p>
 */
public class ListServiceConnectionsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("sericeConnectionType")
    @Validation(required = true)
    private String sericeConnectionType;

    private ListServiceConnectionsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.sericeConnectionType = builder.sericeConnectionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceConnectionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return sericeConnectionType
     */
    public String getSericeConnectionType() {
        return this.sericeConnectionType;
    }

    public static final class Builder extends Request.Builder<ListServiceConnectionsRequest, Builder> {
        private String organizationId; 
        private String sericeConnectionType; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceConnectionsRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.sericeConnectionType = response.sericeConnectionType;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如  https:// devops.aliyun.com/organization/【OrgId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * aliyun_code  阿里云代码 Codeup       Codeup  Gitee        码云 github       Github ack       容器服务Kubernetes(ACK) docker_register_aliyun    容器镜像服务(ACR) ecs          对象存储(OSS) edas          企业级分布式应用(EDAS) emas         移动研发平台(EMAS) fc            阿里云函数计算(FC) kubernetes     自建k8s集群 oss            对象存储(OSS) PACKAGES       制品仓库 ros   资源编排服务(ROS) sae       Serverless应用引擎(SAE)
         */
        public Builder sericeConnectionType(String sericeConnectionType) {
            this.putQueryParameter("sericeConnectionType", sericeConnectionType);
            this.sericeConnectionType = sericeConnectionType;
            return this;
        }

        @Override
        public ListServiceConnectionsRequest build() {
            return new ListServiceConnectionsRequest(this);
        } 

    } 

}
