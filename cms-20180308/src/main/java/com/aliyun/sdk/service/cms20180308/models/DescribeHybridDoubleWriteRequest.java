// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DescribeHybridDoubleWriteRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridDoubleWriteRequest</p>
 */
public class DescribeHybridDoubleWriteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceNamespace")
    private String sourceNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceUserId")
    private String sourceUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetNamespace")
    private String targetNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    private String targetUserId;

    private DescribeHybridDoubleWriteRequest(Builder builder) {
        super(builder);
        this.sourceNamespace = builder.sourceNamespace;
        this.sourceUserId = builder.sourceUserId;
        this.targetNamespace = builder.targetNamespace;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridDoubleWriteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceNamespace
     */
    public String getSourceNamespace() {
        return this.sourceNamespace;
    }

    /**
     * @return sourceUserId
     */
    public String getSourceUserId() {
        return this.sourceUserId;
    }

    /**
     * @return targetNamespace
     */
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<DescribeHybridDoubleWriteRequest, Builder> {
        private String sourceNamespace; 
        private String sourceUserId; 
        private String targetNamespace; 
        private String targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHybridDoubleWriteRequest request) {
            super(request);
            this.sourceNamespace = request.sourceNamespace;
            this.sourceUserId = request.sourceUserId;
            this.targetNamespace = request.targetNamespace;
            this.targetUserId = request.targetUserId;
        } 

        /**
         * SourceNamespace.
         */
        public Builder sourceNamespace(String sourceNamespace) {
            this.putQueryParameter("SourceNamespace", sourceNamespace);
            this.sourceNamespace = sourceNamespace;
            return this;
        }

        /**
         * SourceUserId.
         */
        public Builder sourceUserId(String sourceUserId) {
            this.putQueryParameter("SourceUserId", sourceUserId);
            this.sourceUserId = sourceUserId;
            return this;
        }

        /**
         * TargetNamespace.
         */
        public Builder targetNamespace(String targetNamespace) {
            this.putQueryParameter("TargetNamespace", targetNamespace);
            this.targetNamespace = targetNamespace;
            return this;
        }

        /**
         * TargetUserId.
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public DescribeHybridDoubleWriteRequest build() {
            return new DescribeHybridDoubleWriteRequest(this);
        } 

    } 

}
