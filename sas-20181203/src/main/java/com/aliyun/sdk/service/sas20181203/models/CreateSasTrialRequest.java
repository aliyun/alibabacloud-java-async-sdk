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
         * <p>Specifies whether the request is redirected from the Elastic Compute Service (ECS) console. Valid values:</p>
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
         * <p>The language of the content within the request and response. Valid values:</p>
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
         * <p>The reason why you apply for the trial. You must specify the reason for the second trial.</p>
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
         * <li><strong>0</strong>: trial prohibited</li>
         * <li><strong>1</strong>: first trial</li>
         * <li><strong>2</strong>: second trial</li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2623574.html">GetCanTrySas</a> operation to obtain the trial type. You can start a trial only if this parameter is not set to 0.</p>
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
         * <li><strong>3</strong>: Enterprise</li>
         * <li><strong>7</strong>: Ultimate</li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2623574.html">GetCanTrySas</a> operation to obtain the trial edition.</p>
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

            /**
             * <p>The reason why you apply for the trial.</p>
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
