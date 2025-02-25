// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteVerifyInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebsiteVerifyInfoRequest</p>
 */
public class DescribeWebsiteVerifyInfoRequest extends Request {
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

    private DescribeWebsiteVerifyInfoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteVerifyInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeWebsiteVerifyInfoRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebsiteVerifyInfoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
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

        @Override
        public DescribeWebsiteVerifyInfoRequest build() {
            return new DescribeWebsiteVerifyInfoRequest(this);
        } 

    } 

}
