// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityEventMarkMissIndividuallyRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityEventMarkMissIndividuallyRequest</p>
 */
public class ModifySecurityEventMarkMissIndividuallyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteMarkMissParam")
    private String deleteMarkMissParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InsertMarkMissParam")
    private String insertMarkMissParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
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
         * The alert handling rule that you want to delete.
         */
        public Builder deleteMarkMissParam(String deleteMarkMissParam) {
            this.putBodyParameter("DeleteMarkMissParam", deleteMarkMissParam);
            this.deleteMarkMissParam = deleteMarkMissParam;
            return this;
        }

        /**
         * The ID of the request source. Set the value to **sas**.
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The alert handling that you want to add.
         */
        public Builder insertMarkMissParam(String insertMarkMissParam) {
            this.putBodyParameter("InsertMarkMissParam", insertMarkMissParam);
            this.insertMarkMissParam = insertMarkMissParam;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.
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
