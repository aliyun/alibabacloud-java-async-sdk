// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > bind;

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
    private java.util.List < String > unBind;

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
    public java.util.List < String > getBind() {
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
    public java.util.List < String > getUnBind() {
        return this.unBind;
    }

    public static final class Builder extends Request.Builder<BindAuthToMachineRequest, Builder> {
        private Integer authVersion; 
        private Integer autoBind; 
        private java.util.List < String > bind; 
        private Boolean bindAll; 
        private String criteria; 
        private Integer isPreBind; 
        private String logicalExp; 
        private String ntmVersion; 
        private Long preBindOrderId; 
        private java.util.List < String > unBind; 

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
         * The edition of Security Center that is authorized to protect the asset. Valid values:
         * <p>
         * 
         * *   **6**: Anti-virus edition
         * *   **5**: Advanced edition
         * *   **3**: Enterprise edition
         * *   **7**: Ultimate edition
         * *   **10**: Value-added Plan edition
         */
        public Builder authVersion(Integer authVersion) {
            this.putQueryParameter("AuthVersion", authVersion);
            this.authVersion = authVersion;
            return this;
        }

        /**
         * Specifies whether to automatically bind servers to Security Center. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder autoBind(Integer autoBind) {
            this.putQueryParameter("AutoBind", autoBind);
            this.autoBind = autoBind;
            return this;
        }

        /**
         * The UUIDs of the servers that you want to bind to Security Center.
         * <p>
         * 
         * >  You must specify at least one of the **Bind** and **UnBind** parameters.
         */
        public Builder bind(java.util.List < String > bind) {
            this.putQueryParameter("Bind", bind);
            this.bind = bind;
            return this;
        }

        /**
         * Specifies whether to bind all servers to Security Center. Default value: **false**. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder bindAll(Boolean bindAll) {
            this.putQueryParameter("BindAll", bindAll);
            this.bindAll = bindAll;
            return this;
        }

        /**
         * The search conditions that are used to filter servers. The value of this parameter is in the JSON format and is case-sensitive.
         * <p>
         * 
         * >  A search condition can be an instance ID, instance name, virtual private cloud (VPC) ID, region, or public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * IsPreBind.
         */
        public Builder isPreBind(Integer isPreBind) {
            this.putQueryParameter("IsPreBind", isPreBind);
            this.isPreBind = isPreBind;
            return this;
        }

        /**
         * The logical relationship that you want to use to evaluate multiple search conditions. Default value: **OR**. Valid values:
         * <p>
         * 
         * *   **OR******
         * *   **AND******
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * NtmVersion.
         */
        public Builder ntmVersion(String ntmVersion) {
            this.putQueryParameter("NtmVersion", ntmVersion);
            this.ntmVersion = ntmVersion;
            return this;
        }

        /**
         * PreBindOrderId.
         */
        public Builder preBindOrderId(Long preBindOrderId) {
            this.putQueryParameter("PreBindOrderId", preBindOrderId);
            this.preBindOrderId = preBindOrderId;
            return this;
        }

        /**
         * The UUIDs of the servers that you want to unbind from Security Center.
         * <p>
         * 
         * >  You must specify at least one of the **Bind** and **UnBind** parameters.
         */
        public Builder unBind(java.util.List < String > unBind) {
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
