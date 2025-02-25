// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link CreateProtocolServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateProtocolServiceRequest</p>
 */
public class CreateProtocolServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocolSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Throughput")
    private Integer throughput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private CreateProtocolServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
        this.protocolSpec = builder.protocolSpec;
        this.protocolType = builder.protocolType;
        this.throughput = builder.throughput;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProtocolServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return protocolSpec
     */
    public String getProtocolSpec() {
        return this.protocolSpec;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return throughput
     */
    public Integer getThroughput() {
        return this.throughput;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateProtocolServiceRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String fileSystemId; 
        private String protocolSpec; 
        private String protocolType; 
        private Integer throughput; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProtocolServiceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
            this.protocolSpec = request.protocolSpec;
            this.protocolType = request.protocolType;
            this.throughput = request.throughput;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the protocol service. The name of the protocol service appears in the console.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run.</p>
         * <p>The dry run checks parameter validity and prerequisites. The dry run does not create a protocol service or incur fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run and does not create the protocol service. The system checks the request format, service limits, prerequisites, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the ProtocolServiceId parameter.</li>
         * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a protocol service is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-123****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The specification of the protocol service.</p>
         * <p>Set the value to General (default).</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CL2</li>
         * <li>General</li>
         * <li>CL1</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        public Builder protocolSpec(String protocolSpec) {
            this.putQueryParameter("ProtocolSpec", protocolSpec);
            this.protocolSpec = protocolSpec;
            return this;
        }

        /**
         * <p>The protocol type of the protocol service.</p>
         * <p>Valid value: NFS (default). Only NFSv3 is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The throughput of the protocol service.</p>
         * <p>Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        public Builder throughput(Integer throughput) {
            this.putQueryParameter("Throughput", throughput);
            this.throughput = throughput;
            return this;
        }

        /**
         * <p>The vSwitch ID of the protocol service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-123****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) ID of the protocol service. The VPC ID of the protocol service must be the same as the VPC ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-123****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateProtocolServiceRequest build() {
            return new CreateProtocolServiceRequest(this);
        } 

    } 

}
