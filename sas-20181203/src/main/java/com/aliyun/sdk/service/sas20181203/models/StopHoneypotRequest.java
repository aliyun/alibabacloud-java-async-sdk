// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopHoneypotRequest} extends {@link RequestModel}
 *
 * <p>StopHoneypotRequest</p>
 */
public class StopHoneypotRequest extends Request {
    @Query
    @NameInMap("HoneypotId")
    @Validation(required = true)
    private String honeypotId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private StopHoneypotRequest(Builder builder) {
        super(builder);
        this.honeypotId = builder.honeypotId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopHoneypotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return honeypotId
     */
    public String getHoneypotId() {
        return this.honeypotId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<StopHoneypotRequest, Builder> {
        private String honeypotId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(StopHoneypotRequest request) {
            super(request);
            this.honeypotId = request.honeypotId;
            this.lang = request.lang;
        } 

        /**
         * HoneypotId.
         */
        public Builder honeypotId(String honeypotId) {
            this.putQueryParameter("HoneypotId", honeypotId);
            this.honeypotId = honeypotId;
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

        @Override
        public StopHoneypotRequest build() {
            return new StopHoneypotRequest(this);
        } 

    } 

}
