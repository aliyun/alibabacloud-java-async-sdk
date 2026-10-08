// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link DomainKnowledgeRetrieveRequest} extends {@link RequestModel}
 *
 * <p>DomainKnowledgeRetrieveRequest</p>
 */
public class DomainKnowledgeRetrieveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalTopN")
    private Integer globalTopN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Site")
    private String site;

    private DomainKnowledgeRetrieveRequest(Builder builder) {
        super(builder);
        this.globalTopN = builder.globalTopN;
        this.keyword = builder.keyword;
        this.site = builder.site;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DomainKnowledgeRetrieveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalTopN
     */
    public Integer getGlobalTopN() {
        return this.globalTopN;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return site
     */
    public String getSite() {
        return this.site;
    }

    public static final class Builder extends Request.Builder<DomainKnowledgeRetrieveRequest, Builder> {
        private Integer globalTopN; 
        private String keyword; 
        private String site; 

        private Builder() {
            super();
        } 

        private Builder(DomainKnowledgeRetrieveRequest request) {
            super(request);
            this.globalTopN = request.globalTopN;
            this.keyword = request.keyword;
            this.site = request.site;
        } 

        /**
         * <p>Le nombre de résultats à renvoyer.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder globalTopN(Integer globalTopN) {
            this.putQueryParameter("GlobalTopN", globalTopN);
            this.globalTopN = globalTopN;
            return this;
        }

        /**
         * <p>Les mots-clés à récupérer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>comment renouveler</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>Les sites de la base de connaissances à interroger, y compris cn pour le national, intl pour l\&quot;international et all pour tous.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder site(String site) {
            this.putQueryParameter("Site", site);
            this.site = site;
            return this;
        }

        @Override
        public DomainKnowledgeRetrieveRequest build() {
            return new DomainKnowledgeRetrieveRequest(this);
        } 

    } 

}
