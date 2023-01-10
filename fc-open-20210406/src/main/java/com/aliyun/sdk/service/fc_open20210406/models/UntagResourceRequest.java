// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourceRequest} extends {@link RequestModel}
 *
 * <p>UntagResourceRequest</p>
 */
public class UntagResourceRequest extends Request {
    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("all")
    private Boolean all;

    @Body
    @NameInMap("resourceArn")
    @Validation(required = true)
    private String resourceArn;

    @Body
    @NameInMap("tagKeys")
    private java.util.List < String > tagKeys;

    private UntagResourceRequest(Builder builder) {
        super(builder);
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.all = builder.all;
        this.resourceArn = builder.resourceArn;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourceRequest create() {
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
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return resourceArn
     */
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @return tagKeys
     */
    public java.util.List < String > getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder extends Request.Builder<UntagResourceRequest, Builder> {
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private Boolean all; 
        private String resourceArn; 
        private java.util.List < String > tagKeys; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourceRequest request) {
            super(request);
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.all = request.all;
            this.resourceArn = request.resourceArn;
            this.tagKeys = request.tagKeys;
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
         * The time when Function Compute API is called. Specify the time in the **EEE,d MMM yyyy HH:mm:ss GMT** format.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The custom request ID.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * Specifies whether to remove all tags. This parameter takes effect only when no tag key is specified. Valid values:
         * <p>
         *   - **true**: removes all tags. 
         *   - **false**: does not remove all tags.
         */
        public Builder all(Boolean all) {
            this.putBodyParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * The ARN of the resource. 
         * <p>
         * 
         * > You can use the value of this parameter to query the information about the resource, such as the account, service, and region information of the resource. You can manage tags only for services for top level resources.
         */
        public Builder resourceArn(String resourceArn) {
            this.putBodyParameter("resourceArn", resourceArn);
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * The keys of the tags that you want to remove.
         */
        public Builder tagKeys(java.util.List < String > tagKeys) {
            this.putBodyParameter("tagKeys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        @Override
        public UntagResourceRequest build() {
            return new UntagResourceRequest(this);
        } 

    } 

}
