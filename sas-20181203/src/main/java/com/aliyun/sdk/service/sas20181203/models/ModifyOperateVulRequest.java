// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyOperateVulRequest} extends {@link RequestModel}
 *
 * <p>ModifyOperateVulRequest</p>
 */
public class ModifyOperateVulRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Info")
    @com.aliyun.core.annotation.Validation(required = true)
    private String info;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ModifyOperateVulRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.from = builder.from;
        this.info = builder.info;
        this.operateType = builder.operateType;
        this.reason = builder.reason;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOperateVulRequest create() {
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
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return info
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyOperateVulRequest, Builder> {
        private String clientToken; 
        private String from; 
        private String info; 
        private String operateType; 
        private String reason; 
        private Long resourceDirectoryAccountId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOperateVulRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.from = request.from;
            this.info = request.info;
            this.operateType = request.operateType;
            this.reason = request.reason;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.type = request.type;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Use a different token for each request. Only ASCII characters are supported. The token can be up to 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The source identifier of the request. Set the value to <strong>sas</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The information about the vulnerability to handle. This parameter is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>name</strong>: The name of the vulnerability.</li>
         * <li><strong>uuid</strong>: The UUID of the server on which the vulnerability is detected.</li>
         * <li><strong>tag</strong>: The tag of the vulnerability. Valid values:<ul>
         * <li><strong>oval</strong>: Linux software vulnerability.</li>
         * <li><strong>system</strong>: Windows system vulnerability.</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For other vulnerability types, call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to obtain the vulnerability information.</p>
         * </blockquote>
         * <ul>
         * <li><strong>isFront</strong>: Specifies whether the Windows patch is a prerequisite patch. This field is required only when handling Windows system vulnerabilities and can be ignored for other vulnerability types. Valid values:<ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Batch processing of vulnerabilities is supported. Separate multiple vulnerability entries with commas (,). Call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to obtain the vulnerability information.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;alilinux2:2.1903:ALINUX2-SA-2022:0007&quot;,&quot;uuid&quot;:&quot;a3bb82a8-a3bd-4546-acce-45ac34af****&quot;,&quot;tag&quot;:&quot;oval&quot;,&quot;isFront&quot;:0},{&quot;name&quot;:&quot;alilinux2:2.1903:ALINUX2-SA-2022:0007&quot;,&quot;uuid&quot;:&quot;98a6fecc-88cd-46f2-8e35-f808a388****&quot;,&quot;tag&quot;:&quot;oval&quot;,&quot;isFront&quot;:0}]</p>
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
            return this;
        }

        /**
         * <p>The operation to perform on the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>vul_fix</strong>: Fix the vulnerability.</li>
         * <li><strong>vul_verify</strong>: Verify the vulnerability.</li>
         * <li><strong>vul_ignore</strong>: Ignore the vulnerability.</li>
         * <li><strong>vul_undo_ignore</strong>: Cancel ignoring the vulnerability.</li>
         * <li><strong>vul_delete</strong>: Delete the vulnerability.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vul_fix</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>The reason for ignoring the vulnerability.</p>
         * <blockquote>
         * <p>This parameter is required only when the operation type is <strong>ignore</strong> (OperateType is set to <strong>vul_ignore</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>not operate</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
         * <blockquote>
         * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The type of the vulnerability to handle. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability.</li>
         * <li><strong>sys</strong>: Windows system vulnerability.</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
         * <li><strong>emg</strong>: emergency vulnerability.</li>
         * <li><strong>app</strong>: application vulnerability.</li>
         * <li><strong>sca</strong>: software constituency parsing vulnerability.</li>
         * </ul>
         * <blockquote>
         * <p>Emergency vulnerabilities (emg), application vulnerabilities (app), and software constituency parsing vulnerabilities (sca) do not support the execute vulnerability fix operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyOperateVulRequest build() {
            return new ModifyOperateVulRequest(this);
        } 

    } 

}
