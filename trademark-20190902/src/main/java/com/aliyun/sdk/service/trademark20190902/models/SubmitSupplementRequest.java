// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSupplementRequest} extends {@link RequestModel}
 *
 * <p>SubmitSupplementRequest</p>
 */
public class SubmitSupplementRequest extends Request {
    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("SupplementId")
    @Validation(required = true)
    private Long supplementId;

    @Query
    @NameInMap("UserFiles")
    private java.util.Map < String, ? > userFiles;

    private SubmitSupplementRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.supplementId = builder.supplementId;
        this.userFiles = builder.userFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSupplementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return supplementId
     */
    public Long getSupplementId() {
        return this.supplementId;
    }

    /**
     * @return userFiles
     */
    public java.util.Map < String, ? > getUserFiles() {
        return this.userFiles;
    }

    public static final class Builder extends Request.Builder<SubmitSupplementRequest, Builder> {
        private String content; 
        private Long supplementId; 
        private java.util.Map < String, ? > userFiles; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSupplementRequest request) {
            super(request);
            this.content = request.content;
            this.supplementId = request.supplementId;
            this.userFiles = request.userFiles;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * SupplementId.
         */
        public Builder supplementId(Long supplementId) {
            this.putQueryParameter("SupplementId", supplementId);
            this.supplementId = supplementId;
            return this;
        }

        /**
         * UserFiles.
         */
        public Builder userFiles(java.util.Map < String, ? > userFiles) {
            String userFilesShrink = shrink(userFiles, "UserFiles", "json");
            this.putQueryParameter("UserFiles", userFilesShrink);
            this.userFiles = userFiles;
            return this;
        }

        @Override
        public SubmitSupplementRequest build() {
            return new SubmitSupplementRequest(this);
        } 

    } 

}
