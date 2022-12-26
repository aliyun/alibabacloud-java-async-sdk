// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityEventMarkMissIndividuallyRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityEventMarkMissIndividuallyRequest</p>
 */
public class ModifySecurityEventMarkMissIndividuallyRequest extends Request {
    @Body
    @NameInMap("DeleteMarkMissParam")
    private String deleteMarkMissParam;

    @Body
    @NameInMap("From")
    private String from;

    @Body
    @NameInMap("InsertMarkMissParam")
    private String insertMarkMissParam;

    @Body
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private ModifySecurityEventMarkMissIndividuallyRequest(Builder builder) {
        super(builder);
        this.deleteMarkMissParam = builder.deleteMarkMissParam;
        this.from = builder.from;
        this.insertMarkMissParam = builder.insertMarkMissParam;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityEventMarkMissIndividuallyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteMarkMissParam
     */
    public String getDeleteMarkMissParam() {
        return this.deleteMarkMissParam;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return insertMarkMissParam
     */
    public String getInsertMarkMissParam() {
        return this.insertMarkMissParam;
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

    public static final class Builder extends Request.Builder<ModifySecurityEventMarkMissIndividuallyRequest, Builder> {
        private String deleteMarkMissParam; 
        private String from; 
        private String insertMarkMissParam; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityEventMarkMissIndividuallyRequest request) {
            super(request);
            this.deleteMarkMissParam = request.deleteMarkMissParam;
            this.from = request.from;
            this.insertMarkMissParam = request.insertMarkMissParam;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * 与高级加白格式保持一致
         */
        public Builder deleteMarkMissParam(String deleteMarkMissParam) {
            this.putBodyParameter("DeleteMarkMissParam", deleteMarkMissParam);
            this.deleteMarkMissParam = deleteMarkMissParam;
            return this;
        }

        /**
         * From.
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * 与高级加白格式保持一致
         */
        public Builder insertMarkMissParam(String insertMarkMissParam) {
            this.putBodyParameter("InsertMarkMissParam", insertMarkMissParam);
            this.insertMarkMissParam = insertMarkMissParam;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
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

        @Override
        public ModifySecurityEventMarkMissIndividuallyRequest build() {
            return new ModifySecurityEventMarkMissIndividuallyRequest(this);
        } 

    } 

}
