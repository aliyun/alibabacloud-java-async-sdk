// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link GetDeploymentsByIpRequest} extends {@link RequestModel}
 *
 * <p>GetDeploymentsByIpRequest</p>
 */
public class GetDeploymentsByIpRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dstIp")
    private String dstIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dstPort")
    private String dstPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ignoreJobSummary")
    private Boolean ignoreJobSummary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ignoreResourceSetting")
    private Boolean ignoreResourceSetting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("srcIp")
    private String srcIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("srcPort")
    private String srcPort;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetDeploymentsByIpRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.dstIp = builder.dstIp;
        this.dstPort = builder.dstPort;
        this.ignoreJobSummary = builder.ignoreJobSummary;
        this.ignoreResourceSetting = builder.ignoreResourceSetting;
        this.srcIp = builder.srcIp;
        this.srcPort = builder.srcPort;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeploymentsByIpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return dstIp
     */
    public String getDstIp() {
        return this.dstIp;
    }

    /**
     * @return dstPort
     */
    public String getDstPort() {
        return this.dstPort;
    }

    /**
     * @return ignoreJobSummary
     */
    public Boolean getIgnoreJobSummary() {
        return this.ignoreJobSummary;
    }

    /**
     * @return ignoreResourceSetting
     */
    public Boolean getIgnoreResourceSetting() {
        return this.ignoreResourceSetting;
    }

    /**
     * @return srcIp
     */
    public String getSrcIp() {
        return this.srcIp;
    }

    /**
     * @return srcPort
     */
    public String getSrcPort() {
        return this.srcPort;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetDeploymentsByIpRequest, Builder> {
        private String namespace; 
        private String dstIp; 
        private String dstPort; 
        private Boolean ignoreJobSummary; 
        private Boolean ignoreResourceSetting; 
        private String srcIp; 
        private String srcPort; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetDeploymentsByIpRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.dstIp = request.dstIp;
            this.dstPort = request.dstPort;
            this.ignoreJobSummary = request.ignoreJobSummary;
            this.ignoreResourceSetting = request.ignoreResourceSetting;
            this.srcIp = request.srcIp;
            this.srcPort = request.srcPort;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * dstIp.
         */
        public Builder dstIp(String dstIp) {
            this.putQueryParameter("dstIp", dstIp);
            this.dstIp = dstIp;
            return this;
        }

        /**
         * dstPort.
         */
        public Builder dstPort(String dstPort) {
            this.putQueryParameter("dstPort", dstPort);
            this.dstPort = dstPort;
            return this;
        }

        /**
         * ignoreJobSummary.
         */
        public Builder ignoreJobSummary(Boolean ignoreJobSummary) {
            this.putQueryParameter("ignoreJobSummary", ignoreJobSummary);
            this.ignoreJobSummary = ignoreJobSummary;
            return this;
        }

        /**
         * ignoreResourceSetting.
         */
        public Builder ignoreResourceSetting(Boolean ignoreResourceSetting) {
            this.putQueryParameter("ignoreResourceSetting", ignoreResourceSetting);
            this.ignoreResourceSetting = ignoreResourceSetting;
            return this;
        }

        /**
         * srcIp.
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("srcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        /**
         * srcPort.
         */
        public Builder srcPort(String srcPort) {
            this.putQueryParameter("srcPort", srcPort);
            this.srcPort = srcPort;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetDeploymentsByIpRequest build() {
            return new GetDeploymentsByIpRequest(this);
        } 

    } 

}
