// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddUninstallClientsByUuidsRequest} extends {@link RequestModel}
 *
 * <p>AddUninstallClientsByUuidsRequest</p>
 */
public class AddUninstallClientsByUuidsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallMethod")
    private String callMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Feedback")
    private String feedback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuids;

    private AddUninstallClientsByUuidsRequest(Builder builder) {
        super(builder);
        this.callMethod = builder.callMethod;
        this.feedback = builder.feedback;
        this.region = builder.region;
        this.sourceIp = builder.sourceIp;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUninstallClientsByUuidsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callMethod
     */
    public String getCallMethod() {
        return this.callMethod;
    }

    /**
     * @return feedback
     */
    public String getFeedback() {
        return this.feedback;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<AddUninstallClientsByUuidsRequest, Builder> {
        private String callMethod; 
        private String feedback; 
        private String region; 
        private String sourceIp; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(AddUninstallClientsByUuidsRequest request) {
            super(request);
            this.callMethod = request.callMethod;
            this.feedback = request.feedback;
            this.region = request.region;
            this.sourceIp = request.sourceIp;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The method name. Default value: init.</p>
         * 
         * <strong>example:</strong>
         * <p>init</p>
         */
        public Builder callMethod(String callMethod) {
            this.putQueryParameter("CallMethod", callMethod);
            this.callMethod = callMethod;
            return this;
        }

        /**
         * <p>The feedback.</p>
         * 
         * <strong>example:</strong>
         * <p>reinstall</p>
         */
        public Builder feedback(String feedback) {
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * <p>The region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XXX.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The UUID of the server that you want to unbind. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inet-183707ae-3bdf-4db0-b771-3e9962bf****,inet-49dceccc-4f01-469b-8411-2416ea12****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public AddUninstallClientsByUuidsRequest build() {
            return new AddUninstallClientsByUuidsRequest(this);
        } 

    } 

}
