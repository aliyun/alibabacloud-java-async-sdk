// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAuthToMachineRequest} extends {@link RequestModel}
 *
 * <p>BindAuthToMachineRequest</p>
 */
public class BindAuthToMachineRequest extends Request {
    @Query
    @NameInMap("AuthVersion")
    @Validation(required = true)
    private Integer authVersion;

    @Query
    @NameInMap("AutoBind")
    private Integer autoBind;

    @Query
    @NameInMap("Bind")
    private java.util.List < String > bind;

    @Query
    @NameInMap("BindAll")
    private Boolean bindAll;

    @Query
    @NameInMap("Criteria")
    private String criteria;

    @Query
    @NameInMap("LogicalExp")
    private String logicalExp;

    @Query
    @NameInMap("UnBind")
    private java.util.List < String > unBind;

    private BindAuthToMachineRequest(Builder builder) {
        super(builder);
        this.authVersion = builder.authVersion;
        this.autoBind = builder.autoBind;
        this.bind = builder.bind;
        this.bindAll = builder.bindAll;
        this.criteria = builder.criteria;
        this.logicalExp = builder.logicalExp;
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
     * @return logicalExp
     */
    public String getLogicalExp() {
        return this.logicalExp;
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
        private String logicalExp; 
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
            this.logicalExp = request.logicalExp;
            this.unBind = request.unBind;
        } 

        /**
         * The edition of Security Center. Valid values:
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
         * The shortage in the quota for cores of servers that can be protected.
         */
        public Builder autoBind(Integer autoBind) {
            this.putQueryParameter("AutoBind", autoBind);
            this.autoBind = autoBind;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder bind(java.util.List < String > bind) {
            this.putQueryParameter("Bind", bind);
            this.bind = bind;
            return this;
        }

        /**
         * The UUID of the server that you want to bind to Security Center.
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder bindAll(Boolean bindAll) {
            this.putQueryParameter("BindAll", bindAll);
            this.bindAll = bindAll;
            return this;
        }

        /**
         * The status code that indicates the result. Valid values:
         * <p>
         * 
         * *   **0**: The servers are bound to or unbound from Security Center.
         * *   **1**: The values that you specified for the parameters are invalid.
         * *   **2**: The quota for servers that can be protected is insufficient.
         * *   **3**: The quota for cores of servers that can be protected is insufficient.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * The search conditions that are used to filter servers. The value of this parameter is in the JSON format and is case-sensitive.
         * <p>
         * 
         * >  A search condition can be an instance ID, instance name, virtual private cloud (VPC) ID, region, or public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * Binds servers to Security Center or unbinds servers from Security Center.
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
