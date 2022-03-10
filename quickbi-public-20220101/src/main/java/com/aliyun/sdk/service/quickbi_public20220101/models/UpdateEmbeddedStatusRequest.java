// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEmbeddedStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateEmbeddedStatusRequest</p>
 */
public class UpdateEmbeddedStatusRequest extends Request {
    @Query
    @NameInMap("ThirdPartAuthFlag")
    @Validation(required = true)
    private Boolean thirdPartAuthFlag;

    @Query
    @NameInMap("WorksId")
    @Validation(required = true)
    private String worksId;

    private UpdateEmbeddedStatusRequest(Builder builder) {
        super(builder);
        this.thirdPartAuthFlag = builder.thirdPartAuthFlag;
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEmbeddedStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return thirdPartAuthFlag
     */
    public Boolean getThirdPartAuthFlag() {
        return this.thirdPartAuthFlag;
    }

    /**
     * @return worksId
     */
    public String getWorksId() {
        return this.worksId;
    }

    public static final class Builder extends Request.Builder<UpdateEmbeddedStatusRequest, Builder> {
        private Boolean thirdPartAuthFlag; 
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEmbeddedStatusRequest request) {
            super(request);
            this.thirdPartAuthFlag = request.thirdPartAuthFlag;
            this.worksId = request.worksId;
        } 

        /**
         * ThirdPartAuthFlag.
         */
        public Builder thirdPartAuthFlag(Boolean thirdPartAuthFlag) {
            this.putQueryParameter("ThirdPartAuthFlag", thirdPartAuthFlag);
            this.thirdPartAuthFlag = thirdPartAuthFlag;
            return this;
        }

        /**
         * WorksId.
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public UpdateEmbeddedStatusRequest build() {
            return new UpdateEmbeddedStatusRequest(this);
        } 

    } 

}
