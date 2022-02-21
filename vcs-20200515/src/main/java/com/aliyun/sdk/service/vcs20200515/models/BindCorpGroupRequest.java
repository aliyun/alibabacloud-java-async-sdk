// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindCorpGroupRequest} extends {@link RequestModel}
 *
 * <p>BindCorpGroupRequest</p>
 */
public class BindCorpGroupRequest extends Request {
    @Body
    @NameInMap("CorpGroupId")
    @Validation(required = true)
    private String corpGroupId;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    private BindCorpGroupRequest(Builder builder) {
        super(builder);
        this.corpGroupId = builder.corpGroupId;
        this.corpId = builder.corpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindCorpGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpGroupId
     */
    public String getCorpGroupId() {
        return this.corpGroupId;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    public static final class Builder extends Request.Builder<BindCorpGroupRequest, Builder> {
        private String corpGroupId; 
        private String corpId; 

        private Builder() {
            super();
        } 

        private Builder(BindCorpGroupRequest response) {
            super(response);
            this.corpGroupId = response.corpGroupId;
            this.corpId = response.corpId;
        } 

        /**
         * CorpGroupId.
         */
        public Builder corpGroupId(String corpGroupId) {
            this.putBodyParameter("CorpGroupId", corpGroupId);
            this.corpGroupId = corpGroupId;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        @Override
        public BindCorpGroupRequest build() {
            return new BindCorpGroupRequest(this);
        } 

    } 

}
