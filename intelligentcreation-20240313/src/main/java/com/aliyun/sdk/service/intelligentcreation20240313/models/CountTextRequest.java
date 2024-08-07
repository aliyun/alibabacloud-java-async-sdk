// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountTextRequest} extends {@link RequestModel}
 *
 * <p>CountTextRequest</p>
 */
public class CountTextRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("generationSource")
    private String generationSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("publishStatus")
    private String publishStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("style")
    private String style;

    private CountTextRequest(Builder builder) {
        super(builder);
        this.generationSource = builder.generationSource;
        this.industry = builder.industry;
        this.publishStatus = builder.publishStatus;
        this.style = builder.style;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountTextRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return generationSource
     */
    public String getGenerationSource() {
        return this.generationSource;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return publishStatus
     */
    public String getPublishStatus() {
        return this.publishStatus;
    }

    /**
     * @return style
     */
    public String getStyle() {
        return this.style;
    }

    public static final class Builder extends Request.Builder<CountTextRequest, Builder> {
        private String generationSource; 
        private String industry; 
        private String publishStatus; 
        private String style; 

        private Builder() {
            super();
        } 

        private Builder(CountTextRequest request) {
            super(request);
            this.generationSource = request.generationSource;
            this.industry = request.industry;
            this.publishStatus = request.publishStatus;
            this.style = request.style;
        } 

        /**
         * API
         */
        public Builder generationSource(String generationSource) {
            this.putQueryParameter("generationSource", generationSource);
            this.generationSource = generationSource;
            return this;
        }

        /**
         * industry.
         */
        public Builder industry(String industry) {
            this.putQueryParameter("industry", industry);
            this.industry = industry;
            return this;
        }

        /**
         * publishStatus.
         */
        public Builder publishStatus(String publishStatus) {
            this.putQueryParameter("publishStatus", publishStatus);
            this.publishStatus = publishStatus;
            return this;
        }

        /**
         * style.
         */
        public Builder style(String style) {
            this.putQueryParameter("style", style);
            this.style = style;
            return this;
        }

        @Override
        public CountTextRequest build() {
            return new CountTextRequest(this);
        } 

    } 

}
