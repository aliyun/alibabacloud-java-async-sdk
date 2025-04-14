// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetLineageRelationshipResponseBody} extends {@link TeaModel}
 *
 * <p>GetLineageRelationshipResponseBody</p>
 */
public class GetLineageRelationshipResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LineageRelationship")
    private LineageRelationship lineageRelationship;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLineageRelationshipResponseBody(Builder builder) {
        this.lineageRelationship = builder.lineageRelationship;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLineageRelationshipResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lineageRelationship
     */
    public LineageRelationship getLineageRelationship() {
        return this.lineageRelationship;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LineageRelationship lineageRelationship; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetLineageRelationshipResponseBody model) {
            this.lineageRelationship = model.lineageRelationship;
            this.requestId = model.requestId;
        } 

        /**
         * LineageRelationship.
         */
        public Builder lineageRelationship(LineageRelationship lineageRelationship) {
            this.lineageRelationship = lineageRelationship;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLineageRelationshipResponseBody build() {
            return new GetLineageRelationshipResponseBody(this);
        } 

    } 

}
