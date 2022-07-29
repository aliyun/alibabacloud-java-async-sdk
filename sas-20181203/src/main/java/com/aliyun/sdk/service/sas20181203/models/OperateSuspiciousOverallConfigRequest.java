// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateSuspiciousOverallConfigRequest} extends {@link RequestModel}
 *
 * <p>OperateSuspiciousOverallConfigRequest</p>
 */
public class OperateSuspiciousOverallConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NoTargetAsOn")
    private Boolean noTargetAsOn;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private OperateSuspiciousOverallConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.lang = builder.lang;
        this.noTargetAsOn = builder.noTargetAsOn;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateSuspiciousOverallConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return noTargetAsOn
     */
    public Boolean getNoTargetAsOn() {
        return this.noTargetAsOn;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateSuspiciousOverallConfigRequest, Builder> {
        private String config; 
        private String lang; 
        private Boolean noTargetAsOn; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateSuspiciousOverallConfigRequest request) {
            super(request);
            this.config = request.config;
            this.lang = request.lang;
            this.noTargetAsOn = request.noTargetAsOn;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * NoTargetAsOn.
         */
        public Builder noTargetAsOn(Boolean noTargetAsOn) {
            this.putQueryParameter("NoTargetAsOn", noTargetAsOn);
            this.noTargetAsOn = noTargetAsOn;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateSuspiciousOverallConfigRequest build() {
            return new OperateSuspiciousOverallConfigRequest(this);
        } 

    } 

}
