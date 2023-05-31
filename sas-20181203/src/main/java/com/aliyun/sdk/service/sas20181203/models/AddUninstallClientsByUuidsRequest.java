// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUninstallClientsByUuidsRequest} extends {@link RequestModel}
 *
 * <p>AddUninstallClientsByUuidsRequest</p>
 */
public class AddUninstallClientsByUuidsRequest extends Request {
    @Query
    @NameInMap("CallMethod")
    private String callMethod;

    @Query
    @NameInMap("Feedback")
    private String feedback;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuids")
    @Validation(required = true)
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
         * The method name. Default value: init.
         */
        public Builder callMethod(String callMethod) {
            this.putQueryParameter("CallMethod", callMethod);
            this.callMethod = callMethod;
            return this;
        }

        /**
         * The feedback.
         */
        public Builder feedback(String feedback) {
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * The region in which the server resides.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The UUID of the server that you want to unbind. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.
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
