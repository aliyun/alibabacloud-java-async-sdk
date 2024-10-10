// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The alert handling rule that you want to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;loginSourceIp&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;eventType&quot;:&quot;SIL_AI_ALERT&quot;,&quot;eventName&quot;:&quot;login_common_ip&quot;,&quot;fieldValue&quot;:&quot;10.12.XX.XX&quot;,&quot;uuids&quot;:&quot;&quot;}]</p>
         */
        public Builder deleteMarkMissParam(String deleteMarkMissParam) {
            this.putBodyParameter("DeleteMarkMissParam", deleteMarkMissParam);
            this.deleteMarkMissParam = deleteMarkMissParam;
            return this;
        }

        /**
         * <p>The ID of the request source. Set the value to <strong>sas</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The alert handling that you want to add.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;location&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;eventType&quot;:&quot;SIL_AI_ALERT&quot;,&quot;eventName&quot;:&quot;login_common_ip&quot;,&quot;fieldValue&quot;:&quot;xx&quot;,&quot;uuids&quot;:&quot;4296ee47-bf19-4fa4-a4a6-6bxxxxxxxxx&quot;}]</p>
         */
        public Builder insertMarkMissParam(String insertMarkMissParam) {
            this.putBodyParameter("InsertMarkMissParam", insertMarkMissParam);
            this.insertMarkMissParam = insertMarkMissParam;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.XX.XX</p>
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
