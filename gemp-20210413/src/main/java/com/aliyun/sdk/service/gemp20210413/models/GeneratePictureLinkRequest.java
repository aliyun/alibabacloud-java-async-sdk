// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GeneratePictureLinkRequest} extends {@link RequestModel}
 *
 * <p>GeneratePictureLinkRequest</p>
 */
public class GeneratePictureLinkRequest extends Request {
    @Body
    @NameInMap("keys")
    private java.util.List < String > keys;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    private GeneratePictureLinkRequest(Builder builder) {
        super(builder);
        this.keys = builder.keys;
        this.problemId = builder.problemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneratePictureLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keys
     */
    public java.util.List < String > getKeys() {
        return this.keys;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    public static final class Builder extends Request.Builder<GeneratePictureLinkRequest, Builder> {
        private java.util.List < String > keys; 
        private Long problemId; 

        private Builder() {
            super();
        } 

        private Builder(GeneratePictureLinkRequest response) {
            super(response);
            this.keys = response.keys;
            this.problemId = response.problemId;
        } 

        /**
         * keys
         */
        public Builder keys(java.util.List < String > keys) {
            this.putBodyParameter("keys", keys);
            this.keys = keys;
            return this;
        }

        /**
         * 故障id
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        @Override
        public GeneratePictureLinkRequest build() {
            return new GeneratePictureLinkRequest(this);
        } 

    } 

}
