// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetLocalDefaultRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetLocalDefaultRegionResponseBody</p>
 */
public class GetLocalDefaultRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private GetLocalDefaultRegionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLocalDefaultRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private Integer status; 

        private Builder() {
        } 

        private Builder(GetLocalDefaultRegionResponseBody model) {
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F6D23860-55C2-55AA-B484-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The access type of the multi-cloud site. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The current site is not the default site of the multi-cloud site. You can specify a site as the default site of the multi-cloud site.</li>
         * <li><strong>1</strong>: The current site is the default site of the multi-cloud site.</li>
         * <li><strong>2</strong>: Another site is set as the default site of the multi-cloud site.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public GetLocalDefaultRegionResponseBody build() {
            return new GetLocalDefaultRegionResponseBody(this);
        } 

    } 

}
