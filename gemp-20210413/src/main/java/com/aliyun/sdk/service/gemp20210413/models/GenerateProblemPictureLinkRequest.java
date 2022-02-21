// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateProblemPictureLinkRequest} extends {@link RequestModel}
 *
 * <p>GenerateProblemPictureLinkRequest</p>
 */
public class GenerateProblemPictureLinkRequest extends Request {
    @Body
    @NameInMap("keys")
    private java.util.List < String > keys;

    @Body
    @NameInMap("problemId")
    private String problemId;

    private GenerateProblemPictureLinkRequest(Builder builder) {
        super(builder);
        this.keys = builder.keys;
        this.problemId = builder.problemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateProblemPictureLinkRequest create() {
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
    public String getProblemId() {
        return this.problemId;
    }

    public static final class Builder extends Request.Builder<GenerateProblemPictureLinkRequest, Builder> {
        private java.util.List < String > keys; 
        private String problemId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateProblemPictureLinkRequest response) {
            super(response);
            this.keys = response.keys;
            this.problemId = response.problemId;
        } 

        /**
         * oss key
         */
        public Builder keys(java.util.List < String > keys) {
            this.putBodyParameter("keys", keys);
            this.keys = keys;
            return this;
        }

        /**
         * 故障id
         */
        public Builder problemId(String problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        @Override
        public GenerateProblemPictureLinkRequest build() {
            return new GenerateProblemPictureLinkRequest(this);
        } 

    } 

}
