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
         * AuthVersion.
         */
        public Builder authVersion(Integer authVersion) {
            this.putQueryParameter("AuthVersion", authVersion);
            this.authVersion = authVersion;
            return this;
        }

        /**
         * AutoBind.
         */
        public Builder autoBind(Integer autoBind) {
            this.putQueryParameter("AutoBind", autoBind);
            this.autoBind = autoBind;
            return this;
        }

        /**
         * Bind.
         */
        public Builder bind(java.util.List < String > bind) {
            this.putQueryParameter("Bind", bind);
            this.bind = bind;
            return this;
        }

        /**
         * BindAll.
         */
        public Builder bindAll(Boolean bindAll) {
            this.putQueryParameter("BindAll", bindAll);
            this.bindAll = bindAll;
            return this;
        }

        /**
         * Criteria.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * LogicalExp.
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * UnBind.
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
