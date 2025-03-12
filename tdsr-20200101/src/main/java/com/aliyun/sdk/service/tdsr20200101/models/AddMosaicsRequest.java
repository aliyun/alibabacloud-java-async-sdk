// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link AddMosaicsRequest} extends {@link RequestModel}
 *
 * <p>AddMosaicsRequest</p>
 */
public class AddMosaicsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MarkPosition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String markPosition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subSceneId;

    private AddMosaicsRequest(Builder builder) {
        super(builder);
        this.markPosition = builder.markPosition;
        this.subSceneId = builder.subSceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMosaicsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return markPosition
     */
    public String getMarkPosition() {
        return this.markPosition;
    }

    /**
     * @return subSceneId
     */
    public String getSubSceneId() {
        return this.subSceneId;
    }

    public static final class Builder extends Request.Builder<AddMosaicsRequest, Builder> {
        private String markPosition; 
        private String subSceneId; 

        private Builder() {
            super();
        } 

        private Builder(AddMosaicsRequest request) {
            super(request);
            this.markPosition = request.markPosition;
            this.subSceneId = request.subSceneId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;x&quot;: 504,&quot;y&quot;: 450,&quot;w&quot;: 256,&quot;h&quot;: 153}]</p>
         */
        public Builder markPosition(String markPosition) {
            this.putQueryParameter("MarkPosition", markPosition);
            this.markPosition = markPosition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>skjjskjk****</p>
         */
        public Builder subSceneId(String subSceneId) {
            this.putQueryParameter("SubSceneId", subSceneId);
            this.subSceneId = subSceneId;
            return this;
        }

        @Override
        public AddMosaicsRequest build() {
            return new AddMosaicsRequest(this);
        } 

    } 

}
