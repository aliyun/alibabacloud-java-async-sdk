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
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ModifyOperateVulRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.info = builder.info;
        this.operateType = builder.operateType;
        this.reason = builder.reason;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyOperateVulRequest, Builder> {
        private String from; 
        private String info; 
        private String operateType; 
        private String reason; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOperateVulRequest request) {
            super(request);
            this.from = request.from;
            this.info = request.info;
            this.operateType = request.operateType;
            this.reason = request.reason;
            this.type = request.type;
        } 

        /**
         * <p>The request ID. Set the value to <strong>sas</strong>.</p>
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
         * <p>The details of the vulnerability. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>name</strong>: the name of the vulnerability.</p>
         * </li>
         * <li><p><strong>uuid</strong>: the UUID of the server on which the vulnerability is detected.</p>
         * </li>
         * <li><p><strong>tag</strong>: the tag that is added to the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>oval</strong>: Linux software vulnerability</li>
         * <li><strong>system</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the tags that are added to vulnerabilities of other types.</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>isFront</strong>: specifies whether a pre-patch is required to fix the Windows system vulnerability. This field is required only for Windows system vulnerabilities. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You can fix multiple vulnerabilities at a time. Separate the details of multiple vulnerabilities with commas (,). You can call the <a href="~~DescribeVulList~~">DescribeVulLIst</a> operation to query the details of vulnerabilities.</p>
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
         * <p>The operation that you want to perform on the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>vul_fix</strong>: fixes the vulnerability.</li>
         * <li><strong>vul_verify</strong>: verifies the vulnerability fix.</li>
         * <li><strong>vul_ignore</strong>: ignores the vulnerability.</li>
         * <li><strong>vul_undo_ignore</strong>: cancels ignoring the vulnerability.</li>
         * <li><strong>vul_delete</strong>: deletes the vulnerability.</li>
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
         * <p>The reason why the vulnerability is <strong>ignored</strong>.</p>
         * <blockquote>
         * <p> This parameter is required only when you set <strong>OperateType</strong> to <strong>vul_ignore</strong>.</p>
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
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>emg</strong>: urgent vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>sca</strong>: vulnerability that is detected based on software component analysis</li>
         * </ul>
         * <blockquote>
         * <p> You cannot fix the urgent vulnerabilities, application vulnerabilities, or vulnerabilities that are detected based on software component analysis.</p>
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
