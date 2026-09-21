// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSasTrialRequest} extends {@link RequestModel}
 *
 * <p>CreateSasTrialRequest</p>
 */
public class CreateSasTrialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
        private String clientToken; 
        private Boolean dryRun; 
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
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.fromEcs = request.fromEcs;
            this.lang = request.lang;
            this.requestForm = request.requestForm;
            this.tryType = request.tryType;
            this.tryVersion = request.tryVersion;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. true: performs only a dry run without performing the actual request. false: performs the actual request. Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether the request is from the ECS console. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fromEcs(Boolean fromEcs) {
            this.putBodyParameter("FromEcs", fromEcs);
            this.fromEcs = fromEcs;
            return this;
        }

        /**
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The reason for applying for the trial. This parameter is required for a second trial.</p>
         */
        public Builder requestForm(RequestForm requestForm) {
            String requestFormShrink = shrink(requestForm, "RequestForm", "json");
            this.putBodyParameter("RequestForm", requestFormShrink);
            this.requestForm = requestForm;
            return this;
        }

        /**
         * <p>The trial type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Trial is not allowed.</li>
         * <li><strong>1</strong>: First trial.</li>
         * <li><strong>2</strong>: Second trial.</li>
         * </ul>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2623574.html">GetCanTrySas</a> operation to obtain this parameter. The trial can be started only when the value is not 0.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tryType(Integer tryType) {
            this.putBodyParameter("TryType", tryType);
            this.tryType = tryType;
            return this;
        }

        /**
         * <p>The trial edition. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2623574.html">GetCanTrySas</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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

    /**
     * 
     * {@link CreateSasTrialRequest} extends {@link TeaModel}
     *
     * <p>CreateSasTrialRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(RequestForm model) {
                this.tryReason = model.tryReason;
            } 

            /**
             * <p>The reason for applying for the trial.</p>
             * 
             * <strong>example:</strong>
             * <p>for poc</p>
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
