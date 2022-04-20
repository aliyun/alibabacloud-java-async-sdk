// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClusterStatusLogtailStatusRecordValueValue} extends {@link TeaModel}
 *
 * <p>ClusterStatusLogtailStatusRecordValueValue</p>
 */
public class ClusterStatusLogtailStatusRecordValueValue extends TeaModel {
    @NameInMap("Title")
    private String title;

    @NameInMap("Url")
    private String url;

    private ClusterStatusLogtailStatusRecordValueValue(Builder builder) {
        this.title = builder.title;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterStatusLogtailStatusRecordValueValue create() {
        return builder().build();
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String title; 
        private String url; 

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public ClusterStatusLogtailStatusRecordValueValue build() {
            return new ClusterStatusLogtailStatusRecordValueValue(this);
        } 

    } 

}
