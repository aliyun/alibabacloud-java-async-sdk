// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCanTrySasRequest} extends {@link RequestModel}
 *
 * <p>GetCanTrySasRequest</p>
 */
public class GetCanTrySasRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromEcs")
    private Boolean fromEcs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private GetCanTrySasRequest(Builder builder) {
        super(builder);
        this.fromEcs = builder.fromEcs;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCanTrySasRequest create() {
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

    public static final class Builder extends Request.Builder<GetCanTrySasRequest, Builder> {
        private Boolean fromEcs; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetCanTrySasRequest request) {
            super(request);
            this.fromEcs = request.fromEcs;
            this.lang = request.lang;
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
         * The language of the content within the request and response. Default value: **zh**. Valid values:
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

        @Override
        public GetCanTrySasRequest build() {
            return new GetCanTrySasRequest(this);
        } 

    } 

}
