// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChangeLogRequest} extends {@link RequestModel}
 *
 * <p>GetChangeLogRequest</p>
 */
public class GetChangeLogRequest extends Request {
    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    @Body
    @NameInMap("TargetIds")
    @Validation(required = true)
    private java.util.Map < String, ? > targetIds;

    @Body
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    private GetChangeLogRequest(Builder builder) {
        super(builder);
        this.corpIdentifier = builder.corpIdentifier;
        this.targetIds = builder.targetIds;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdentifier
     */
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    /**
     * @return targetIds
     */
    public java.util.Map < String, ? > getTargetIds() {
        return this.targetIds;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<GetChangeLogRequest, Builder> {
        private String corpIdentifier; 
        private java.util.Map < String, ? > targetIds; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(GetChangeLogRequest response) {
            super(response);
            this.corpIdentifier = response.corpIdentifier;
            this.targetIds = response.targetIds;
            this.targetType = response.targetType;
        } 

        /**
         * CorpIdentifier.
         */
        public Builder corpIdentifier(String corpIdentifier) {
            this.putQueryParameter("CorpIdentifier", corpIdentifier);
            this.corpIdentifier = corpIdentifier;
            return this;
        }

        /**
         * TargetIds.
         */
        public Builder targetIds(java.util.Map < String, ? > targetIds) {
            this.putBodyParameter("TargetIds", targetIds);
            this.targetIds = targetIds;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public GetChangeLogRequest build() {
            return new GetChangeLogRequest(this);
        } 

    } 

}
