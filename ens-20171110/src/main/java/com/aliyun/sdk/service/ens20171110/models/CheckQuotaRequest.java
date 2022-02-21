// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckQuotaRequest} extends {@link RequestModel}
 *
 * <p>CheckQuotaRequest</p>
 */
public class CheckQuotaRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true, minimum = 1)
    private Long aliUid;

    @Query
    @NameInMap("GroupUuid")
    private String groupUuid;

    @Body
    @NameInMap("ResourceAttribute")
    @Validation(required = true)
    private String resourceAttribute;

    private CheckQuotaRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.groupUuid = builder.groupUuid;
        this.resourceAttribute = builder.resourceAttribute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return groupUuid
     */
    public String getGroupUuid() {
        return this.groupUuid;
    }

    /**
     * @return resourceAttribute
     */
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    public static final class Builder extends Request.Builder<CheckQuotaRequest, Builder> {
        private Long aliUid; 
        private String groupUuid; 
        private String resourceAttribute; 

        private Builder() {
            super();
        } 

        private Builder(CheckQuotaRequest response) {
            super(response);
            this.aliUid = response.aliUid;
            this.groupUuid = response.groupUuid;
            this.resourceAttribute = response.resourceAttribute;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * GroupUuid.
         */
        public Builder groupUuid(String groupUuid) {
            this.putQueryParameter("GroupUuid", groupUuid);
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * ResourceAttribute.
         */
        public Builder resourceAttribute(String resourceAttribute) {
            this.putBodyParameter("ResourceAttribute", resourceAttribute);
            this.resourceAttribute = resourceAttribute;
            return this;
        }

        @Override
        public CheckQuotaRequest build() {
            return new CheckQuotaRequest(this);
        } 

    } 

}
