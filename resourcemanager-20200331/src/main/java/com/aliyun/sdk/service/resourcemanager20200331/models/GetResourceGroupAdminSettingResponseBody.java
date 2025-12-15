// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link GetResourceGroupAdminSettingResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupAdminSettingResponseBody</p>
 */
public class GetResourceGroupAdminSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatorAsAdmin")
    private Boolean creatorAsAdmin;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResourceGroupAdminSettingResponseBody(Builder builder) {
        this.creatorAsAdmin = builder.creatorAsAdmin;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupAdminSettingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creatorAsAdmin
     */
    public Boolean getCreatorAsAdmin() {
        return this.creatorAsAdmin;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean creatorAsAdmin; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetResourceGroupAdminSettingResponseBody model) {
            this.creatorAsAdmin = model.creatorAsAdmin;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether enable the Use Creator as Administrator feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder creatorAsAdmin(Boolean creatorAsAdmin) {
            this.creatorAsAdmin = creatorAsAdmin;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>776B05B3-A0B0-464B-A191-F4E1119A94B2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceGroupAdminSettingResponseBody build() {
            return new GetResourceGroupAdminSettingResponseBody(this);
        } 

    } 

}
