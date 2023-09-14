// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappTemplateMetricRequest} extends {@link RequestModel}
 *
 * <p>GetChatappTemplateMetricRequest</p>
 */
public class GetChatappTemplateMetricRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Query
    @NameInMap("End")
    @Validation(required = true)
    private Long end;

    @Query
    @NameInMap("Granularity")
    private String granularity;

    @Query
    @NameInMap("IsvCode")
    private String isvCode;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("Start")
    @Validation(required = true)
    private Long start;

    @Query
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    @Query
    @NameInMap("TemplateType")
    private String templateType;

    private GetChatappTemplateMetricRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.end = builder.end;
        this.granularity = builder.granularity;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.start = builder.start;
        this.templateCode = builder.templateCode;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatappTemplateMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<GetChatappTemplateMetricRequest, Builder> {
        private String custSpaceId; 
        private Long end; 
        private String granularity; 
        private String isvCode; 
        private String language; 
        private Long start; 
        private String templateCode; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(GetChatappTemplateMetricRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.end = request.end;
            this.granularity = request.granularity;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.start = request.start;
            this.templateCode = request.templateCode;
            this.templateType = request.templateType;
        } 

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * End.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * Granularity.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * IsvCode.
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public GetChatappTemplateMetricRequest build() {
            return new GetChatappTemplateMetricRequest(this);
        } 

    } 

}
