// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCompareDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCompareDetailRequest</p>
 */
public class GetCompareDetailRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxDiffByte")
    private Integer maxDiffByte;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxDiffFile")
    private Integer maxDiffFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mergeBase")
    private Boolean mergeBase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("to")
    @com.aliyun.core.annotation.Validation(required = true)
    private String to;

    private GetCompareDetailRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.from = builder.from;
        this.maxDiffByte = builder.maxDiffByte;
        this.maxDiffFile = builder.maxDiffFile;
        this.mergeBase = builder.mergeBase;
        this.organizationId = builder.organizationId;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCompareDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return maxDiffByte
     */
    public Integer getMaxDiffByte() {
        return this.maxDiffByte;
    }

    /**
     * @return maxDiffFile
     */
    public Integer getMaxDiffFile() {
        return this.maxDiffFile;
    }

    /**
     * @return mergeBase
     */
    public Boolean getMergeBase() {
        return this.mergeBase;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetCompareDetailRequest, Builder> {
        private Long repositoryId; 
        private String from; 
        private Integer maxDiffByte; 
        private Integer maxDiffFile; 
        private Boolean mergeBase; 
        private String organizationId; 
        private String to; 

        private Builder() {
            super();
        } 

        private Builder(GetCompareDetailRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.from = request.from;
            this.maxDiffByte = request.maxDiffByte;
            this.maxDiffFile = request.maxDiffFile;
            this.mergeBase = request.mergeBase;
            this.organizationId = request.organizationId;
            this.to = request.to;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * from.
         */
        public Builder from(String from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * maxDiffByte.
         */
        public Builder maxDiffByte(Integer maxDiffByte) {
            this.putQueryParameter("maxDiffByte", maxDiffByte);
            this.maxDiffByte = maxDiffByte;
            return this;
        }

        /**
         * maxDiffFile.
         */
        public Builder maxDiffFile(Integer maxDiffFile) {
            this.putQueryParameter("maxDiffFile", maxDiffFile);
            this.maxDiffFile = maxDiffFile;
            return this;
        }

        /**
         * mergeBase.
         */
        public Builder mergeBase(Boolean mergeBase) {
            this.putQueryParameter("mergeBase", mergeBase);
            this.mergeBase = mergeBase;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * to.
         */
        public Builder to(String to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        @Override
        public GetCompareDetailRequest build() {
            return new GetCompareDetailRequest(this);
        } 

    } 

}
