// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link TraceSiteRequest} extends {@link RequestModel}
 *
 * <p>TraceSiteRequest</p>
 */
public class TraceSiteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Body")
    private TraceSiteRequestBody body;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Context")
    private Context context;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cookies")
    private java.util.List<Cookies> cookies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Headers")
    private java.util.List<Headers> headers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Method")
    private String method;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private TraceSiteRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.context = builder.context;
        this.cookies = builder.cookies;
        this.headers = builder.headers;
        this.method = builder.method;
        this.protocol = builder.protocol;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TraceSiteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public TraceSiteRequestBody getBody() {
        return this.body;
    }

    /**
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return cookies
     */
    public java.util.List<Cookies> getCookies() {
        return this.cookies;
    }

    /**
     * @return headers
     */
    public java.util.List<Headers> getHeaders() {
        return this.headers;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<TraceSiteRequest, Builder> {
        private TraceSiteRequestBody body; 
        private Context context; 
        private java.util.List<Cookies> cookies; 
        private java.util.List<Headers> headers; 
        private String method; 
        private String protocol; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(TraceSiteRequest request) {
            super(request);
            this.body = request.body;
            this.context = request.context;
            this.cookies = request.cookies;
            this.headers = request.headers;
            this.method = request.method;
            this.protocol = request.protocol;
            this.url = request.url;
        } 

        /**
         * Body.
         */
        public Builder body(TraceSiteRequestBody body) {
            String bodyShrink = shrink(body, "Body", "json");
            this.putBodyParameter("Body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * Context.
         */
        public Builder context(Context context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * Cookies.
         */
        public Builder cookies(java.util.List<Cookies> cookies) {
            String cookiesShrink = shrink(cookies, "Cookies", "json");
            this.putBodyParameter("Cookies", cookiesShrink);
            this.cookies = cookies;
            return this;
        }

        /**
         * Headers.
         */
        public Builder headers(java.util.List<Headers> headers) {
            String headersShrink = shrink(headers, "Headers", "json");
            this.putBodyParameter("Headers", headersShrink);
            this.headers = headers;
            return this;
        }

        /**
         * Method.
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/test">http://example.com/test</a></p>
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public TraceSiteRequest build() {
            return new TraceSiteRequest(this);
        } 

    } 

    /**
     * 
     * {@link TraceSiteRequest} extends {@link TeaModel}
     *
     * <p>TraceSiteRequest</p>
     */
    public static class TraceSiteRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Json")
        private Object json;

        @com.aliyun.core.annotation.NameInMap("PlainText")
        private String plainText;

        private TraceSiteRequestBody(Builder builder) {
            this.json = builder.json;
            this.plainText = builder.plainText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceSiteRequestBody create() {
            return builder().build();
        }

        /**
         * @return json
         */
        public Object getJson() {
            return this.json;
        }

        /**
         * @return plainText
         */
        public String getPlainText() {
            return this.plainText;
        }

        public static final class Builder {
            private Object json; 
            private String plainText; 

            private Builder() {
            } 

            private Builder(TraceSiteRequestBody model) {
                this.json = model.json;
                this.plainText = model.plainText;
            } 

            /**
             * Json.
             */
            public Builder json(Object json) {
                this.json = json;
                return this;
            }

            /**
             * PlainText.
             */
            public Builder plainText(String plainText) {
                this.plainText = plainText;
                return this;
            }

            public TraceSiteRequestBody build() {
                return new TraceSiteRequestBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link TraceSiteRequest} extends {@link TeaModel}
     *
     * <p>TraceSiteRequest</p>
     */
    public static class GeoLocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("IspCode")
        private String ispCode;

        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        private GeoLocation(Builder builder) {
            this.countryCode = builder.countryCode;
            this.ispCode = builder.ispCode;
            this.regionCode = builder.regionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeoLocation create() {
            return builder().build();
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return ispCode
         */
        public String getIspCode() {
            return this.ispCode;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        public static final class Builder {
            private String countryCode; 
            private String ispCode; 
            private String regionCode; 

            private Builder() {
            } 

            private Builder(GeoLocation model) {
                this.countryCode = model.countryCode;
                this.ispCode = model.ispCode;
                this.regionCode = model.regionCode;
            } 

            /**
             * CountryCode.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * IspCode.
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * RegionCode.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            public GeoLocation build() {
                return new GeoLocation(this);
            } 

        } 

    }
    /**
     * 
     * {@link TraceSiteRequest} extends {@link TeaModel}
     *
     * <p>TraceSiteRequest</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GeoLocation")
        private GeoLocation geoLocation;

        @com.aliyun.core.annotation.NameInMap("SkipChallenge")
        private Boolean skipChallenge;

        private Context(Builder builder) {
            this.geoLocation = builder.geoLocation;
            this.skipChallenge = builder.skipChallenge;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return geoLocation
         */
        public GeoLocation getGeoLocation() {
            return this.geoLocation;
        }

        /**
         * @return skipChallenge
         */
        public Boolean getSkipChallenge() {
            return this.skipChallenge;
        }

        public static final class Builder {
            private GeoLocation geoLocation; 
            private Boolean skipChallenge; 

            private Builder() {
            } 

            private Builder(Context model) {
                this.geoLocation = model.geoLocation;
                this.skipChallenge = model.skipChallenge;
            } 

            /**
             * GeoLocation.
             */
            public Builder geoLocation(GeoLocation geoLocation) {
                this.geoLocation = geoLocation;
                return this;
            }

            /**
             * SkipChallenge.
             */
            public Builder skipChallenge(Boolean skipChallenge) {
                this.skipChallenge = skipChallenge;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    /**
     * 
     * {@link TraceSiteRequest} extends {@link TeaModel}
     *
     * <p>TraceSiteRequest</p>
     */
    public static class Cookies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Cookies(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cookies create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Cookies model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Cookies build() {
                return new Cookies(this);
            } 

        } 

    }
    /**
     * 
     * {@link TraceSiteRequest} extends {@link TeaModel}
     *
     * <p>TraceSiteRequest</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Headers(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
}
