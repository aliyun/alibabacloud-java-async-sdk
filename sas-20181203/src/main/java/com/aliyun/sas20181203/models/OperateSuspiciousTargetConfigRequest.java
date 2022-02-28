// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateSuspiciousTargetConfigRequest} extends {@link RequestModel}
 *
 * <p>OperateSuspiciousTargetConfigRequest</p>
 */
public class OperateSuspiciousTargetConfigRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TargetOperations")
    private String targetOperations;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    @Query
    @NameInMap("Type")
    private String type;

    private OperateSuspiciousTargetConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.targetOperations = builder.targetOperations;
        this.targetType = builder.targetType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateSuspiciousTargetConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return targetOperations
     */
    public String getTargetOperations() {
        return this.targetOperations;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateSuspiciousTargetConfigRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private String targetOperations; 
        private String targetType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateSuspiciousTargetConfigRequest response) {
            super(response);
            this.lang = response.lang;
            this.sourceIp = response.sourceIp;
            this.targetOperations = response.targetOperations;
            this.targetType = response.targetType;
            this.type = response.type;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * TargetOperations.
         */
        public Builder targetOperations(String targetOperations) {
            this.putQueryParameter("TargetOperations", targetOperations);
            this.targetOperations = targetOperations;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
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
        public OperateSuspiciousTargetConfigRequest build() {
            return new OperateSuspiciousTargetConfigRequest(this);
        } 

    } 

}
