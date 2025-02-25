// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTagsRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTagsRequest</p>
 */
public class GetResourceTagsRequest extends Request {
    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Query
    @NameInMap("resourceArn")
    @Validation(required = true)
    private String resourceArn;

    private GetResourceTagsRequest(Builder builder) {
        super(builder);
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.resourceArn = builder.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return resourceArn
     */
    public String getResourceArn() {
        return this.resourceArn;
    }

    public static final class Builder extends Request.Builder<GetResourceTagsRequest, Builder> {
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private String resourceArn; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceTagsRequest request) {
            super(request);
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.resourceArn = request.resourceArn;
        } 

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * The time when the function is invoked. The value is in the **EEE,d MMM yyyy HH:mm:ss GMT** format.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the resource.
         * <p>
         * 
         * >  You can use the value of this parameter to query information about the resource, such as the account, service, and region of the resource. You can manage tags only for services for top level resources.
         */
        public Builder resourceArn(String resourceArn) {
            this.putQueryParameter("resourceArn", resourceArn);
            this.resourceArn = resourceArn;
            return this;
        }

        @Override
        public GetResourceTagsRequest build() {
            return new GetResourceTagsRequest(this);
        } 

    } 

}
