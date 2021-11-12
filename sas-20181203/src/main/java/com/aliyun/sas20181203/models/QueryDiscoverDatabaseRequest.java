// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link QueryDiscoverDatabaseRequest} extends {@link RequestModel}
 *
 * <p>QueryDiscoverDatabaseRequest</p>
 */
public class QueryDiscoverDatabaseRequest extends Request {
    @Query
    @NameInMap("CreateMark")
    private String createMark;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;


    private QueryDiscoverDatabaseRequest(Builder builder) {
        super(builder);
        this.createMark = builder.createMark;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDiscoverDatabaseRequest create() {
        return builder().build();
    }

    /**
     * @return createMark
     */
    public String getCreateMark() {
        return this.createMark;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder {
        private String createMark; 
        private Long resourceOwnerId; 
        private String sourceIp; 

        /**
         * <p>CreateMark.</p>
         */
        public Builder createMark(String createMark) {
            this.putQueryParameter("CreateMark", createMark);
            this.createMark = createMark;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        public QueryDiscoverDatabaseRequest build() {
            return new QueryDiscoverDatabaseRequest(this);
        } 

    } 

}
