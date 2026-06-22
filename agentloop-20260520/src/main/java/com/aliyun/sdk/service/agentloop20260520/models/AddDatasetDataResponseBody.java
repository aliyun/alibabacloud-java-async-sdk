// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link AddDatasetDataResponseBody} extends {@link TeaModel}
 *
 * <p>AddDatasetDataResponseBody</p>
 */
public class AddDatasetDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("affectedRows")
    private Integer affectedRows;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private AddDatasetDataResponseBody(Builder builder) {
        this.affectedRows = builder.affectedRows;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDatasetDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affectedRows
     */
    public Integer getAffectedRows() {
        return this.affectedRows;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer affectedRows; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddDatasetDataResponseBody model) {
            this.affectedRows = model.affectedRows;
            this.requestId = model.requestId;
        } 

        /**
         * affectedRows.
         */
        public Builder affectedRows(Integer affectedRows) {
            this.affectedRows = affectedRows;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D0173835-9E0F-508F-8BFA-9F556E59C302</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddDatasetDataResponseBody build() {
            return new AddDatasetDataResponseBody(this);
        } 

    } 

}
