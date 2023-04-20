// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileRequest} extends {@link RequestModel}
 *
 * <p>ListFileRequest</p>
 */
public class ListFileRequest extends Request {
    @Body
    @NameInMap("FileId")
    private String fileId;

    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Body
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("Prefix")
    private String prefix;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private ListFileRequest(Builder builder) {
        super(builder);
        this.fileId = builder.fileId;
        this.keyword = builder.keyword;
        this.mode = builder.mode;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.prefix = builder.prefix;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<ListFileRequest, Builder> {
        private String fileId; 
        private String keyword; 
        private String mode; 
        private String nextToken; 
        private Integer pageSize; 
        private String prefix; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListFileRequest request) {
            super(request);
            this.fileId = request.fileId;
            this.keyword = request.keyword;
            this.mode = request.mode;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.prefix = request.prefix;
            this.spaceId = request.spaceId;
        } 

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.putBodyParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public ListFileRequest build() {
            return new ListFileRequest(this);
        } 

    } 

}
