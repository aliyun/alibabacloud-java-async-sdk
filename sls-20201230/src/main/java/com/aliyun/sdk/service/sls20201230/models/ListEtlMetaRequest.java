// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListEtlMetaRequest} extends {@link RequestModel}
 *
 * <p>ListEtlMetaRequest</p>
 */
public class ListEtlMetaRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("etlMetaKey")
    @Validation(required = true)
    private String etlMetaKey;

    @Query
    @NameInMap("etlMetaName")
    @Validation(required = true)
    private String etlMetaName;

    @Query
    @NameInMap("etlMetaTag")
    @Validation(required = true)
    private String etlMetaTag;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListEtlMetaRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.etlMetaKey = builder.etlMetaKey;
        this.etlMetaName = builder.etlMetaName;
        this.etlMetaTag = builder.etlMetaTag;
        this.offset = builder.offset;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEtlMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return etlMetaKey
     */
    public String getEtlMetaKey() {
        return this.etlMetaKey;
    }

    /**
     * @return etlMetaName
     */
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    /**
     * @return etlMetaTag
     */
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListEtlMetaRequest, Builder> {
        private String project; 
        private String etlMetaKey; 
        private String etlMetaName; 
        private String etlMetaTag; 
        private Integer offset; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListEtlMetaRequest request) {
            super(request);
            this.project = request.project;
            this.etlMetaKey = request.etlMetaKey;
            this.etlMetaName = request.etlMetaName;
            this.etlMetaTag = request.etlMetaTag;
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * etlMetaKey.
         */
        public Builder etlMetaKey(String etlMetaKey) {
            this.putQueryParameter("etlMetaKey", etlMetaKey);
            this.etlMetaKey = etlMetaKey;
            return this;
        }

        /**
         * etlMetaName.
         */
        public Builder etlMetaName(String etlMetaName) {
            this.putQueryParameter("etlMetaName", etlMetaName);
            this.etlMetaName = etlMetaName;
            return this;
        }

        /**
         * etlMetaTag.
         */
        public Builder etlMetaTag(String etlMetaTag) {
            this.putQueryParameter("etlMetaTag", etlMetaTag);
            this.etlMetaTag = etlMetaTag;
            return this;
        }

        /**
         * 默认值 0。
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * 默认值 200.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListEtlMetaRequest build() {
            return new ListEtlMetaRequest(this);
        } 

    } 

}
