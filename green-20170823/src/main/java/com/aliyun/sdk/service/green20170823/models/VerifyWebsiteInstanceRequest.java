// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyWebsiteInstanceRequest} extends {@link RequestModel}
 *
 * <p>VerifyWebsiteInstanceRequest</p>
 */
public class VerifyWebsiteInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("VerifyMethod")
    @Validation(required = true)
    private String verifyMethod;

    private VerifyWebsiteInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.verifyMethod = builder.verifyMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyWebsiteInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return verifyMethod
     */
    public String getVerifyMethod() {
        return this.verifyMethod;
    }

    public static final class Builder extends Request.Builder<VerifyWebsiteInstanceRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String sourceIp; 
        private String verifyMethod; 

        private Builder() {
            super();
        } 

        private Builder(VerifyWebsiteInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.verifyMethod = request.verifyMethod;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * VerifyMethod.
         */
        public Builder verifyMethod(String verifyMethod) {
            this.putQueryParameter("VerifyMethod", verifyMethod);
            this.verifyMethod = verifyMethod;
            return this;
        }

        @Override
        public VerifyWebsiteInstanceRequest build() {
            return new VerifyWebsiteInstanceRequest(this);
        } 

    } 

}
