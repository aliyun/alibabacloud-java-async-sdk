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
 * {@link BindAuthToMachineRequest} extends {@link RequestModel}
 *
 * <p>BindAuthToMachineRequest</p>
 */
public class BindAuthToMachineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthVersion")
    private Integer authVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBind")
    private Integer autoBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bind")
    private java.util.List<String> bind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindAll")
    private Boolean bindAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPreBind")
    private Integer isPreBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalExp")
    private String logicalExp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NtmVersion")
    private String ntmVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreBindOrderId")
    private Long preBindOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnBind")
    private java.util.List<String> unBind;

    private BindAuthToMachineRequest(Builder builder) {
        super(builder);
        this.authVersion = builder.authVersion;
        this.autoBind = builder.autoBind;
        this.bind = builder.bind;
        this.bindAll = builder.bindAll;
        this.criteria = builder.criteria;
        this.isPreBind = builder.isPreBind;
        this.logicalExp = builder.logicalExp;
        this.ntmVersion = builder.ntmVersion;
        this.preBindOrderId = builder.preBindOrderId;
        this.unBind = builder.unBind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAuthToMachineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authVersion
     */
    public Integer getAuthVersion() {
        return this.authVersion;
    }

    /**
     * @return autoBind
     */
    public Integer getAutoBind() {
        return this.autoBind;
    }

    /**
     * @return bind
     */
    public java.util.List<String> getBind() {
        return this.bind;
    }

    /**
     * @return bindAll
     */
    public Boolean getBindAll() {
        return this.bindAll;
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return isPreBind
     */
    public Integer getIsPreBind() {
        return this.isPreBind;
    }

    /**
     * @return logicalExp
     */
    public String getLogicalExp() {
        return this.logicalExp;
    }

    /**
     * @return ntmVersion
     */
    public String getNtmVersion() {
        return this.ntmVersion;
    }

    /**
     * @return preBindOrderId
     */
    public Long getPreBindOrderId() {
        return this.preBindOrderId;
    }

    /**
     * @return unBind
     */
    public java.util.List<String> getUnBind() {
        return this.unBind;
    }

    public static final class Builder extends Request.Builder<BindAuthToMachineRequest, Builder> {
        private Integer authVersion; 
        private Integer autoBind; 
        private java.util.List<String> bind; 
        private Boolean bindAll; 
        private String criteria; 
        private Integer isPreBind; 
        private String logicalExp; 
        private String ntmVersion; 
        private Long preBindOrderId; 
        private java.util.List<String> unBind; 

        private Builder() {
            super();
        } 

        private Builder(BindAuthToMachineRequest request) {
            super(request);
            this.authVersion = request.authVersion;
            this.autoBind = request.autoBind;
            this.bind = request.bind;
            this.bindAll = request.bindAll;
            this.criteria = request.criteria;
            this.isPreBind = request.isPreBind;
            this.logicalExp = request.logicalExp;
            this.ntmVersion = request.ntmVersion;
            this.preBindOrderId = request.preBindOrderId;
            this.unBind = request.unBind;
        } 

        /**
         * <p>The edition of Security Center that is authorized to scan the asset. Valid values:</p>
         * <ul>
         * <li><strong>6</strong>: Anti-virus</li>
         * <li><strong>5</strong>: Advanced</li>
         * <li><strong>3</strong>: Enterprise</li>
         * <li><strong>7</strong>: Ultimate</li>
         * <li><strong>10</strong>: Value-added Plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder authVersion(Integer authVersion) {
            this.putQueryParameter("AuthVersion", authVersion);
            this.authVersion = authVersion;
            return this;
        }

        /**
         * <p>Specifies whether to automatically bind servers to Security Center. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoBind(Integer autoBind) {
            this.putQueryParameter("AutoBind", autoBind);
            this.autoBind = autoBind;
            return this;
        }

        /**
         * <p>The UUIDs of the servers that you want to bind to Security Center.</p>
         * <blockquote>
         * <p> You must specify at least one of the <strong>Bind</strong> and <strong>UnBind</strong> parameters.</p>
         * </blockquote>
         */
        public Builder bind(java.util.List<String> bind) {
            this.putQueryParameter("Bind", bind);
            this.bind = bind;
            return this;
        }

        /**
         * <p>Specifies whether to bind all servers to Security Center. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder bindAll(Boolean bindAll) {
            this.putQueryParameter("BindAll", bindAll);
            this.bindAll = bindAll;
            return this;
        }

        /**
         * <p>The search conditions that are used to filter servers. The value of this parameter is in the JSON format and is case-sensitive.</p>
         * <blockquote>
         * <p> A search condition can be an instance ID, instance name, virtual private cloud (VPC) ID, region, or public IP address. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;internetIp&quot;,&quot;value&quot;:&quot;1.2.XX.XX&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>Specifies whether to specify servers for protection when you purchase Security Center. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * <blockquote>
         * <p> If you specify servers, the servers are automatically added to Security Center for protection after the purchase order is complete.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isPreBind(Integer isPreBind) {
            this.putQueryParameter("IsPreBind", isPreBind);
            this.isPreBind = isPreBind;
            return this;
        }

        /**
         * <p>The logical relationship that you want to use to evaluate multiple search conditions. Default value: <strong>OR</strong>. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>****</li>
         * <li><strong>AND</strong>****</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * <p>The edition of Security Center that you purchase in the order. Valid values:</p>
         * <ul>
         * <li><strong>level7</strong>: Anti-virus</li>
         * <li><strong>level3</strong>: Advanced</li>
         * <li><strong>level2</strong>: Enterprise</li>
         * <li><strong>level8</strong>: Ultimate</li>
         * <li><strong>level10</strong>: Value-added Plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level2</p>
         */
        public Builder ntmVersion(String ntmVersion) {
            this.putQueryParameter("NtmVersion", ntmVersion);
            this.ntmVersion = ntmVersion;
            return this;
        }

        /**
         * <p>The ID of the order in which Security Center is purchased and servers are specified for protection.</p>
         * 
         * <strong>example:</strong>
         * <p>233016**0482</p>
         */
        public Builder preBindOrderId(Long preBindOrderId) {
            this.putQueryParameter("PreBindOrderId", preBindOrderId);
            this.preBindOrderId = preBindOrderId;
            return this;
        }

        /**
         * <p>The UUIDs of the servers that you want to unbind from Security Center.</p>
         * <blockquote>
         * <p> You must specify at least one of the <strong>Bind</strong> and <strong>UnBind</strong> parameters.</p>
         * </blockquote>
         */
        public Builder unBind(java.util.List<String> unBind) {
            this.putQueryParameter("UnBind", unBind);
            this.unBind = unBind;
            return this;
        }

        @Override
        public BindAuthToMachineRequest build() {
            return new BindAuthToMachineRequest(this);
        } 

    } 

}
