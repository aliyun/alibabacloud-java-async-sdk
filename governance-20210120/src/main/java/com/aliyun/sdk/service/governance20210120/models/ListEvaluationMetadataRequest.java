// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListEvaluationMetadataRequest} extends {@link RequestModel}
 *
 * <p>ListEvaluationMetadataRequest</p>
 */
public class ListEvaluationMetadataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListEvaluationMetadataRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationMetadataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListEvaluationMetadataRequest, Builder> {
        private String language; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEvaluationMetadataRequest request) {
            super(request);
            this.language = request.language;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The language. The information is returned in the specified language. Valid values:</p>
         * <ul>
         * <li>en: English</li>
         * <li>zh: Chinese</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListEvaluationMetadataRequest build() {
            return new ListEvaluationMetadataRequest(this);
        } 

    } 

}
