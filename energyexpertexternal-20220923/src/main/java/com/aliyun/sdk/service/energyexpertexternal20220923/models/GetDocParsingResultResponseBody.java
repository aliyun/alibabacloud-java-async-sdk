// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetDocParsingResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocParsingResultResponseBody</p>
 */
public class GetDocParsingResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDocParsingResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocParsingResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDocParsingResultResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDocParsingResultResponseBody build() {
            return new GetDocParsingResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDocParsingResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocParsingResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        private Data(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private String content; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
            } 

            /**
             * <ul>
             * <li>The parsed content of the document.</li>
             * <li>The format (markdown or json) is determined by the returnFormat parameter. For specific format details, refer to: <a href="https://www.alibabacloud.com/help/en/energy-expert/developer-reference/interface-attached-information#b644b6255cojj">json return structure</a></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;doc_info&quot;:{&quot;languages&quot;:[&quot;zh&quot;,&quot;en&quot;],&quot;doc_type&quot;:&quot;pdf&quot;,&quot;pdf_toc&quot;:[{&quot;title&quot;:&quot;封面&quot;,&quot;level&quot;:0,&quot;page&quot;:0}],&quot;pages&quot;:366,&quot;page_list&quot;:[{&quot;imageWidth&quot;:596,&quot;imageHeight&quot;:842,&quot;pageIdAllDocs&quot;:0,&quot;fileIndex&quot;:0,&quot;pageIdCurDoc&quot;:0,&quot;angle&quot;:0}],&quot;doc_data&quot;:[{&quot;uniqueId&quot;:&quot;about_us_para&quot;,&quot;page_num&quot;:&quot;01&quot;,&quot;index&quot;:&quot;xxx&quot;,&quot;name&quot;:&quot;xxx&quot;,&quot;type&quot;:&quot;xxxx&quot;,&quot;subType&quot;:&quot;xxx&quot;,&quot;text&quot;:&quot;xxx&quot;,&quot;before_text&quot;:&quot;xxx&quot;,&quot;after_text&quot;:&quot;xxx&quot;,&quot;extInfo&quot;:[{&quot;uniqueId&quot;:&quot;b0x1x0&quot;,&quot;pos&quot;:[{&quot;x&quot;:229,&quot;y&quot;:208},{&quot;x&quot;:421,&quot;y&quot;:208},{&quot;x&quot;:421,&quot;y&quot;:242},{&quot;x&quot;:229,&quot;y&quot;:242}],&quot;text&quot;:&quot;Kurt Götze&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;subType&quot;:&quot;Text&quot;,&quot;pageNum&quot;:[0],&quot;index&quot;:0}]}]}}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
