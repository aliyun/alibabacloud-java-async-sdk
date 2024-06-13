// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportBizAlertInfoRequest} extends {@link RequestModel}
 *
 * <p>ReportBizAlertInfoRequest</p>
 */
public class ReportBizAlertInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertDescription")
    private String alertDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertDetail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertGrade")
    private String alertGrade;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLabels")
    private String alertLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertScene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertUid")
    private java.util.List < Long > alertUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    private ReportBizAlertInfoRequest(Builder builder) {
        super(builder);
        this.alertDescription = builder.alertDescription;
        this.alertDetail = builder.alertDetail;
        this.alertGrade = builder.alertGrade;
        this.alertLabels = builder.alertLabels;
        this.alertScene = builder.alertScene;
        this.alertToken = builder.alertToken;
        this.alertUid = builder.alertUid;
        this.language = builder.language;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportBizAlertInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertDescription
     */
    public String getAlertDescription() {
        return this.alertDescription;
    }

    /**
     * @return alertDetail
     */
    public String getAlertDetail() {
        return this.alertDetail;
    }

    /**
     * @return alertGrade
     */
    public String getAlertGrade() {
        return this.alertGrade;
    }

    /**
     * @return alertLabels
     */
    public String getAlertLabels() {
        return this.alertLabels;
    }

    /**
     * @return alertScene
     */
    public String getAlertScene() {
        return this.alertScene;
    }

    /**
     * @return alertToken
     */
    public String getAlertToken() {
        return this.alertToken;
    }

    /**
     * @return alertUid
     */
    public java.util.List < Long > getAlertUid() {
        return this.alertUid;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder extends Request.Builder<ReportBizAlertInfoRequest, Builder> {
        private String alertDescription; 
        private String alertDetail; 
        private String alertGrade; 
        private String alertLabels; 
        private String alertScene; 
        private String alertToken; 
        private java.util.List < Long > alertUid; 
        private String language; 

        private Builder() {
            super();
        } 

        private Builder(ReportBizAlertInfoRequest request) {
            super(request);
            this.alertDescription = request.alertDescription;
            this.alertDetail = request.alertDetail;
            this.alertGrade = request.alertGrade;
            this.alertLabels = request.alertLabels;
            this.alertScene = request.alertScene;
            this.alertToken = request.alertToken;
            this.alertUid = request.alertUid;
            this.language = request.language;
        } 

        /**
         * AlertDescription.
         */
        public Builder alertDescription(String alertDescription) {
            this.putQueryParameter("AlertDescription", alertDescription);
            this.alertDescription = alertDescription;
            return this;
        }

        /**
         * AlertDetail.
         */
        public Builder alertDetail(String alertDetail) {
            this.putQueryParameter("AlertDetail", alertDetail);
            this.alertDetail = alertDetail;
            return this;
        }

        /**
         * AlertGrade.
         */
        public Builder alertGrade(String alertGrade) {
            this.putQueryParameter("AlertGrade", alertGrade);
            this.alertGrade = alertGrade;
            return this;
        }

        /**
         * AlertLabels.
         */
        public Builder alertLabels(String alertLabels) {
            this.putQueryParameter("AlertLabels", alertLabels);
            this.alertLabels = alertLabels;
            return this;
        }

        /**
         * AlertScene.
         */
        public Builder alertScene(String alertScene) {
            this.putQueryParameter("AlertScene", alertScene);
            this.alertScene = alertScene;
            return this;
        }

        /**
         * AlertToken.
         */
        public Builder alertToken(String alertToken) {
            this.putQueryParameter("AlertToken", alertToken);
            this.alertToken = alertToken;
            return this;
        }

        /**
         * AlertUid.
         */
        public Builder alertUid(java.util.List < Long > alertUid) {
            String alertUidShrink = shrink(alertUid, "AlertUid", "json");
            this.putQueryParameter("AlertUid", alertUidShrink);
            this.alertUid = alertUid;
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

        @Override
        public ReportBizAlertInfoRequest build() {
            return new ReportBizAlertInfoRequest(this);
        } 

    } 

}
