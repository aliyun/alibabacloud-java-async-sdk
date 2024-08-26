// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryArtExtensionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryArtExtensionResponseBody</p>
 */
public class QueryArtExtensionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DateOrPeriod")
    private String dateOrPeriod;

    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private String dimensions;

    @com.aliyun.core.annotation.NameInMap("Features")
    private String features;

    @com.aliyun.core.annotation.NameInMap("InscriptionsAndMarkings")
    private String inscriptionsAndMarkings;

    @com.aliyun.core.annotation.NameInMap("Maker")
    private String maker;

    @com.aliyun.core.annotation.NameInMap("MaterialsAndTechniques")
    private String materialsAndTechniques;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("Reference")
    private String reference;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Subject")
    private String subject;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private QueryArtExtensionResponseBody(Builder builder) {
        this.dateOrPeriod = builder.dateOrPeriod;
        this.dimensions = builder.dimensions;
        this.features = builder.features;
        this.inscriptionsAndMarkings = builder.inscriptionsAndMarkings;
        this.maker = builder.maker;
        this.materialsAndTechniques = builder.materialsAndTechniques;
        this.objectType = builder.objectType;
        this.reference = builder.reference;
        this.requestId = builder.requestId;
        this.subject = builder.subject;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryArtExtensionResponseBody create() {
        return builder().build();
    }

    /**
     * @return dateOrPeriod
     */
    public String getDateOrPeriod() {
        return this.dateOrPeriod;
    }

    /**
     * @return dimensions
     */
    public String getDimensions() {
        return this.dimensions;
    }

    /**
     * @return features
     */
    public String getFeatures() {
        return this.features;
    }

    /**
     * @return inscriptionsAndMarkings
     */
    public String getInscriptionsAndMarkings() {
        return this.inscriptionsAndMarkings;
    }

    /**
     * @return maker
     */
    public String getMaker() {
        return this.maker;
    }

    /**
     * @return materialsAndTechniques
     */
    public String getMaterialsAndTechniques() {
        return this.materialsAndTechniques;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return reference
     */
    public String getReference() {
        return this.reference;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String dateOrPeriod; 
        private String dimensions; 
        private String features; 
        private String inscriptionsAndMarkings; 
        private String maker; 
        private String materialsAndTechniques; 
        private String objectType; 
        private String reference; 
        private String requestId; 
        private String subject; 
        private String title; 

        /**
         * DateOrPeriod.
         */
        public Builder dateOrPeriod(String dateOrPeriod) {
            this.dateOrPeriod = dateOrPeriod;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        /**
         * Features.
         */
        public Builder features(String features) {
            this.features = features;
            return this;
        }

        /**
         * InscriptionsAndMarkings.
         */
        public Builder inscriptionsAndMarkings(String inscriptionsAndMarkings) {
            this.inscriptionsAndMarkings = inscriptionsAndMarkings;
            return this;
        }

        /**
         * Maker.
         */
        public Builder maker(String maker) {
            this.maker = maker;
            return this;
        }

        /**
         * MaterialsAndTechniques.
         */
        public Builder materialsAndTechniques(String materialsAndTechniques) {
            this.materialsAndTechniques = materialsAndTechniques;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * Reference.
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Subject.
         */
        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public QueryArtExtensionResponseBody build() {
            return new QueryArtExtensionResponseBody(this);
        } 

    } 

}
