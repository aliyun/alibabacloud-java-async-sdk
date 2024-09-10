// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSasTrialRequest} extends {@link RequestModel}
 *
 * <p>CreateSasTrialRequest</p>
 */
public class CreateSasTrialRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromEcs")
    private Boolean fromEcs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestForm")
    private RequestForm requestForm;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TryType")
    private Integer tryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TryVersion")
    private Integer tryVersion;

    private CreateSasTrialRequest(Builder builder) {
        super(builder);
        this.fromEcs = builder.fromEcs;
        this.lang = builder.lang;
        this.requestForm = builder.requestForm;
        this.tryType = builder.tryType;
        this.tryVersion = builder.tryVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSasTrialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromEcs
     */
    public Boolean getFromEcs() {
        return this.fromEcs;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return requestForm
     */
    public RequestForm getRequestForm() {
        return this.requestForm;
    }

    /**
     * @return tryType
     */
    public Integer getTryType() {
        return this.tryType;
    }

    /**
     * @return tryVersion
     */
    public Integer getTryVersion() {
        return this.tryVersion;
    }

    public static final class Builder extends Request.Builder<CreateSasTrialRequest, Builder> {
        private Boolean fromEcs; 
        private String lang; 
        private RequestForm requestForm; 
        private Integer tryType; 
        private Integer tryVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateSasTrialRequest request) {
            super(request);
            this.fromEcs = request.fromEcs;
            this.lang = request.lang;
            this.requestForm = request.requestForm;
            this.tryType = request.tryType;
            this.tryVersion = request.tryVersion;
        } 

        /**
         * Specifies whether the request is redirected from the Elastic Compute Service (ECS) console. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder fromEcs(Boolean fromEcs) {
            this.putBodyParameter("FromEcs", fromEcs);
            this.fromEcs = fromEcs;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
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
         * The reason why you apply for the trial. You must specify the reason for the second trial.
         */
        public Builder requestForm(RequestForm requestForm) {
            String requestFormShrink = shrink(requestForm, "RequestForm", "json");
            this.putBodyParameter("RequestForm", requestFormShrink);
            this.requestForm = requestForm;
            return this;
        }

        /**
         * The trial type. Valid values:
         * <p>
         * 
         * *   **0**: trial prohibited
         * *   **1**: first trial
         * *   **2**: second trial
         * 
         * >  You can call the [GetCanTrySas](~~2623574~~) operation to obtain the trial type. You can start a trial only if this parameter is not set to 0.
         */
        public Builder tryType(Integer tryType) {
            this.putBodyParameter("TryType", tryType);
            this.tryType = tryType;
            return this;
        }

        /**
         * The trial edition. Valid values:
         * <p>
         * 
         * *   **3**: Enterprise
         * *   **7**: Ultimate
         * 
         * >  You can call the [GetCanTrySas](~~2623574~~) operation to obtain the trial edition.
         */
        public Builder tryVersion(Integer tryVersion) {
            this.putBodyParameter("TryVersion", tryVersion);
            this.tryVersion = tryVersion;
            return this;
        }

        @Override
        public CreateSasTrialRequest build() {
            return new CreateSasTrialRequest(this);
        } 

    } 

    public static class RequestForm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TryReason")
        private String tryReason;

        private RequestForm(Builder builder) {
            this.tryReason = builder.tryReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestForm create() {
            return builder().build();
        }

        /**
         * @return tryReason
         */
        public String getTryReason() {
            return this.tryReason;
        }

        public static final class Builder {
            private String tryReason; 

            /**
             * The reason why you apply for the trial.
             */
            public Builder tryReason(String tryReason) {
                this.tryReason = tryReason;
                return this;
            }

            public RequestForm build() {
                return new RequestForm(this);
            } 

        } 

    }
}
