// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveSingleTaskForSaveArtExtensionRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForSaveArtExtensionRequest</p>
 */
public class SaveSingleTaskForSaveArtExtensionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateOrPeriod")
    private String dateOrPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private String dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Features")
    private String features;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InscriptionsAndMarkings")
    private String inscriptionsAndMarkings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Maker")
    private String maker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaterialsAndTechniques")
    private String materialsAndTechniques;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reference")
    private String reference;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subject")
    private String subject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private SaveSingleTaskForSaveArtExtensionRequest(Builder builder) {
        super(builder);
        this.dateOrPeriod = builder.dateOrPeriod;
        this.dimensions = builder.dimensions;
        this.domainName = builder.domainName;
        this.features = builder.features;
        this.inscriptionsAndMarkings = builder.inscriptionsAndMarkings;
        this.lang = builder.lang;
        this.maker = builder.maker;
        this.materialsAndTechniques = builder.materialsAndTechniques;
        this.objectType = builder.objectType;
        this.reference = builder.reference;
        this.subject = builder.subject;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForSaveArtExtensionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<SaveSingleTaskForSaveArtExtensionRequest, Builder> {
        private String dateOrPeriod; 
        private String dimensions; 
        private String domainName; 
        private String features; 
        private String inscriptionsAndMarkings; 
        private String lang; 
        private String maker; 
        private String materialsAndTechniques; 
        private String objectType; 
        private String reference; 
        private String subject; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForSaveArtExtensionRequest request) {
            super(request);
            this.dateOrPeriod = request.dateOrPeriod;
            this.dimensions = request.dimensions;
            this.domainName = request.domainName;
            this.features = request.features;
            this.inscriptionsAndMarkings = request.inscriptionsAndMarkings;
            this.lang = request.lang;
            this.maker = request.maker;
            this.materialsAndTechniques = request.materialsAndTechniques;
            this.objectType = request.objectType;
            this.reference = request.reference;
            this.subject = request.subject;
            this.title = request.title;
        } 

        /**
         * DateOrPeriod.
         */
        public Builder dateOrPeriod(String dateOrPeriod) {
            this.putQueryParameter("DateOrPeriod", dateOrPeriod);
            this.dateOrPeriod = dateOrPeriod;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(String dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.art</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Features.
         */
        public Builder features(String features) {
            this.putQueryParameter("Features", features);
            this.features = features;
            return this;
        }

        /**
         * InscriptionsAndMarkings.
         */
        public Builder inscriptionsAndMarkings(String inscriptionsAndMarkings) {
            this.putQueryParameter("InscriptionsAndMarkings", inscriptionsAndMarkings);
            this.inscriptionsAndMarkings = inscriptionsAndMarkings;
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
         * Maker.
         */
        public Builder maker(String maker) {
            this.putQueryParameter("Maker", maker);
            this.maker = maker;
            return this;
        }

        /**
         * MaterialsAndTechniques.
         */
        public Builder materialsAndTechniques(String materialsAndTechniques) {
            this.putQueryParameter("MaterialsAndTechniques", materialsAndTechniques);
            this.materialsAndTechniques = materialsAndTechniques;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * Reference.
         */
        public Builder reference(String reference) {
            this.putQueryParameter("Reference", reference);
            this.reference = reference;
            return this;
        }

        /**
         * Subject.
         */
        public Builder subject(String subject) {
            this.putQueryParameter("Subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public SaveSingleTaskForSaveArtExtensionRequest build() {
            return new SaveSingleTaskForSaveArtExtensionRequest(this);
        } 

    } 

}
